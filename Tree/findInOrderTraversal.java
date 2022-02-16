package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class findInOrderTraversal {
    //     [iteration]
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res= new ArrayList<Integer>();
//         accessTree(root, res);
//         return res;
//     }

    //     public void accessTree(TreeNode root, List<Integer> res) {
//         if (root == null) {
//             return;
//         }
//         accessTree(root.left, res);
//         res.add(root.val);
//         accessTree(root.right, res);
//     }
//     [loop]
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while(root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
