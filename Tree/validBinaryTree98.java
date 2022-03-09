package Tree;

import javax.swing.tree.TreeNode;

public class validBinaryTree98 {
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }

    boolean valid(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        if (max != null && root.val >= max.val) return false;
        if (min != null && root.val <= min.val) return false; // 注意min和max是节点
        return valid(root.left, min, root) && valid(root.right, root, max);
    }
}
