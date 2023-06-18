package org.yarkov.medium;

import org.yarkov.structure.TreeNode;

public class BstToGst {

    private int ans;

    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            ans += root.val;
            root.val = ans;
            bstToGst(root.left);
        }
        return root;
    }

}
