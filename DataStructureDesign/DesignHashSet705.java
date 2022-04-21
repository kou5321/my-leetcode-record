package DataStructureDesign;

public class DesignHashSet705 {
    private final boolean[] set;

    public DesignHashSet705() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}
