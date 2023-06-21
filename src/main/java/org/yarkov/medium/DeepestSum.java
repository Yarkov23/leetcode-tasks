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
}
