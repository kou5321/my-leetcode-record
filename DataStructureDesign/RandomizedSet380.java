package DataStructureDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet380 {
    class RandomizedSet {
        HashMap<Integer, Integer> map;
        List<Integer> list;
        Random rand;

        public RandomizedSet() {
            list = new ArrayList<Integer>();
            map = new HashMap<>();
            rand = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            int tmp = list.get(list.size() - 1);
            int index = map.get(val);
            list.set(index, tmp); // 注意不要搞反
            map.put(tmp, index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }

        public int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
