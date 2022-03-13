package ExhaustiveSearch;

import java.util.LinkedList;
import java.util.List;

public class Combinations77 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, k ,1);
        return res;
    }

    public void backtrack(int n, int k, int start) {
        // base case
        if (track.size() == k) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = start; i <= n; i++) {
            if (track.contains(i)) {
                continue;
            }
            track.add(i);
            backtrack(n, k, i+1);
            track.removeLast();
        }
    }
}
