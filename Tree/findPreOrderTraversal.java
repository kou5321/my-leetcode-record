package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class findPreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        accessTree(root, res);
        return res;
    }

    public void accessTree(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        accessTree(root.left, res);
        accessTree(root.right, res);
    }
}
