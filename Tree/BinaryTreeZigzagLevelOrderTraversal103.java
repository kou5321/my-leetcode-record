package Tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            int sz = q.size();
            LinkedList<Integer> lst = new LinkedList<>(); // List<Integer> 报错
            for (int i = 0; i < sz; i++) {
                TreeNode node = q.poll();
                if (flag) {
                    lst.addLast(node.val); // 注意顺序
                } else {
                    lst.addFirst(node.val);
                }
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            flag = !flag;
            res.add(lst);
        }
        return res;
    }
}
