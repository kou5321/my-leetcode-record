package ExhaustiveSearch;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTree111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) { // 注意不是小于等于
                TreeNode cur = q.poll();
                if (cur.left == null && cur.right == null)
                    return depth;
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
