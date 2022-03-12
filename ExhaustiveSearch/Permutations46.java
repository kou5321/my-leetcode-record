package ExhaustiveSearch;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> track = new ArrayList<>();
        backTrack(nums, track);
        return res;
    }

    public void backTrack(int[] nums, ArrayList<Integer> track) {
        if (track.size() == nums.length) {
            res.add(new ArrayList<Integer>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            backTrack(nums, track);
            track.remove(track.size() - 1);
        }
    }
}
