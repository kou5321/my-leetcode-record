package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class findPostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        accessTree(root, res);
        return res;
    }

    public void accessTree(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        accessTree(root.left, res);
        accessTree(root.right, res);
        res.add(root.val);
    }
}
