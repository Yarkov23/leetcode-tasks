package org.yarkov.easy;

import org.yarkov.structure.TreeNode;

public class RangeSumBST {

    private static int sum = 0;

    public static int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null)
            return 0;

        if (root.val > low && root.val < high)
            sum += root.val;

        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);

        return sum;
    }

}
