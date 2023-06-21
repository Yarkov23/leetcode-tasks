package org.yarkov.easy;

import org.yarkov.structure.TreeNode;

public class CorrespondingNode {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if (cloned == null) {
            return null;
        }

        if (cloned.val == target.val) {
            return cloned;
        }

        if (cloned.left != null) {
            getTargetCopy(original, cloned.left, target);
        } else {
            getTargetCopy(original, cloned.right, target);
        }

        return cloned;

    }


}
