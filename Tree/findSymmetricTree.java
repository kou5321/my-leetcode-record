package Tree;

import javax.swing.tree.TreeNode;

public class findSymmetricTree {
    // 101
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return deepCheck(root.left, root.right);
    }

    public boolean deepCheck(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return deepCheck(left.left, right.right) && deepCheck(left.right, right.left);
    }
}
