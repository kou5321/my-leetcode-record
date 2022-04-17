package Tree;

import javax.swing.tree.TreeNode;

public class IncreasingOrderSearchTree897 {
    TreeNode tail;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        tail = dummy;
        dfs(root);
        return dummy.right;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        root.left = null;
        tail.right = root;
        tail = root;
        dfs(root.right);
    }
}
