package org.yarkov.easy;

import org.yarkov.structure.TreeNode;

public class SymmetricTreeSolution {

    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.right, root.left);
    }

    public boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (right == null && left == null) return true;

        if (left.val != right.val) return false;

        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

}
