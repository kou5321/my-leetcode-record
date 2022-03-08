package Tree;

import javax.swing.tree.TreeNode;

public class convertBSTtoGreaterTree538 {
    private int sum;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }
}
