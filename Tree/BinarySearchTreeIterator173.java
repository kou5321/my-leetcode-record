package Tree;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class BinarySearchTreeIterator173 {
    Stack<TreeNode> stk = new Stack<>();

    public void pushLeft(TreeNode root) {
        while (root != null) {
            stk.push(root);
            root = root.left;
        }
    }

    public BinarySearchTreeIterator173(TreeNode root) {
        pushLeft(root);
    }

    public int next() {
        TreeNode p = stk.pop();
        pushLeft(p.right);
        return p.val;
    }

    public boolean hasNext() {
        return !stk.isEmpty();
    }
}
