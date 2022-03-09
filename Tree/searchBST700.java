package Tree;

import javax.swing.tree.TreeNode;

public class searchBST700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val > val) {
            return searchBST(root.left, val); // 注意要return
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return root;
    }
}
