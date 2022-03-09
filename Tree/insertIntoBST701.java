package Tree;

import javax.swing.tree.TreeNode;

public class insertIntoBST701 {
    public TreeNode insertIntoBST701(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val); // no return but equals
        } else if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
