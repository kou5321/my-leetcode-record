package Tree;

import javax.swing.tree.TreeNode;

public class TreeDiameter543 {
    private int maxD;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return maxD;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        int D = findDepth(root.left) + findDepth(root.right);
        if (D > maxD) maxD = D;
        traverse(root.left);
        traverse(root.right);
    }

    public int findDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findDepth(root.left);
        int right = findDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
