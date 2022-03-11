package Graph;

public class UF323 {
    public static class UF {
        // 连通分量个数
        private int count;
        // 存储⼀棵树
        private static int[] parent;
        // 记录树的「重量」
        private static int[] size;
        // n 为图中节点的个数
        public UF(int n) {
            this.count = n;
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        // 将节点 p 和节点 q 连通
        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ)
                return;

            // ⼩树接到⼤树下⾯，较平衡
            if (size[rootP] > size[rootQ]) {
                parent[rootQ] = rootP;
                size[rootP] += size[rootQ];
            } else {
                parent[rootP] = rootQ;
                size[rootQ] += size[rootP];
            }
            // 两个连通分量合并成⼀个连通分量
            count--;
        }
        // 判断节点 p 和节点 q 是否连通
        public boolean connected(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            return rootP == rootQ;
        }
        // 返回节点 x 的连通分量根节点
        private int find(int x) {
            while (parent[x] != x) {
                // 进⾏路径压缩
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
        // 返回图中的连通分量个数
        public int count() {
            return count;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        UF uf = new UF(5);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }
        System.out.println(uf.connected(0,2));
        System.out.println(uf.find(1));
        System.out.println(uf.count());
    }
}
