package org.yarkov.medium;

import org.yarkov.structure.TreeNode;

public class ConstructBST {

    public TreeNode bstFromPreorder(final int[] preorder) {

        TreeNode root = new TreeNode(preorder[0]);

        for (var num : preorder) {
            addRecursive(root, num);
        }

        return root;
    }

    private TreeNode addRecursive(TreeNode current, final int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.val) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

}
