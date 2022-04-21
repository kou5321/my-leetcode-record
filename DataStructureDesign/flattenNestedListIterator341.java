package DataStructureDesign;

import java.util.Stack;

public class flattenNestedListIterator341 {
    private Stack<NestedInteger> stk = new Stack<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        this.stk = new Stack<>();
        flatten(nestedList, stk);
    }

    @Override
    public Integer next() {
        return hasNext() ? stk.pop().getInteger() : null;
    }

    @Override
    public boolean hasNext() {
        while (!stk.isEmpty()) {
            if (stk.peek().isInteger()) {
                return true;
            } else {
                flatten(stk.pop().getList(), stk);
            }
        }
        return false;
    }

    public void flatten(List<NestedInteger> nestedList, Stack<NestedInteger> stk) {
        if (nestedList == null) return;
        for (int i = nestedList.size() - 1; i >=0; i--) {
            stk.push(nestedList.get(i));
        }
    }
}
