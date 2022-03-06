package Queue;

import java.util.LinkedHashMap;

public class LRUCache146 {
    int cap = 0;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache146(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        if  (cache.containsKey(key)) {
            cache.put(key, value);
            makeRecently(key);
            return;
        }

        if (cache.size() >= this.cap) {
            // 头部就是最旧的
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        cache.put(key, value);
    }

    public void makeRecently(int key) {
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
    }
}
