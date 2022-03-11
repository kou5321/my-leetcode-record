package Graph;

public class IsGraphBipartite785 {
    private boolean ok = true;
    private boolean[] color;
    private boolean[] visited;

    public boolean isBipartite(int[][] graph) {
        color = new boolean[graph.length];
        visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                traverse(graph, i);
            }
        }
        return ok;
    }

    public void traverse(int[][] graph, int v) {
        if (!ok) return;
        visited[v] = true;
        for (int w : graph[v]) {
            if (!visited[w]) {
                // 相邻节点没有被访问
                color[w] = !color[v];
                // 这里不用标记访问
                traverse(graph, w);
            } else {
                if (color[w] == color[v]) {
                    ok = false;
                }
            }
        }
    }
}
