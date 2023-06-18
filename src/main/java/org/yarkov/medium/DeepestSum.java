package org.yarkov.medium;


import org.yarkov.structure.TreeNode;

public class DeepestSum {

    private int maxLevel;
    private int sum;

    public int deepestLeavesSum(TreeNode root) {
        if (root == null)
            return 0;
        findSumLevel(root, 0);
        return sum;
    }

    private void findSumLevel(TreeNode root, int level) {
        if (root == null)
            return;

        if (level > maxLevel) {
            sum = 0;
            maxLevel = level;
        }
        if (level == maxLevel) {
            sum += root.val;
        }

        findSumLevel(root.right, level + 1);
        findSumLevel(root.left, level + 1);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.right = new TreeNode();
        root.right.val = 3;
        root.left = new TreeNode();
        root.left.val = 2;
        System.out.println(new DeepestSum().deepestLeavesSum(root));
    }
}
