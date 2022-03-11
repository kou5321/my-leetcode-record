package Graph;

import java.util.ArrayList;
import java.util.List;

public class possibleBipartition886 {
    boolean ok = true;
    boolean[] visited;
    boolean[] color;

    public boolean possibleBipartition(int n, int[][] dislikes) {
        color = new boolean[n+1];
        visited = new boolean[n+1];
        List<Integer>[] graph = buildGraph(n, dislikes);
        for (int i = 1; i <= n; i++) {
            traverse(graph, i);
        }
        return ok;
    }

    public List<Integer>[] buildGraph(int n, int[][] dislikes) {
        List<Integer>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : dislikes) {
            int v = edge[0];
            int w = edge[1];
            graph[v].add(w);
            graph[w].add(v);
        }
        return graph;
    }

    public void traverse(List<Integer>[] graph, int n) {
        if (!ok) return;
        visited[n] = true;
        for (int w : graph[n]) {
            if (!visited[w]) {
                color[w] = !color[n];
                traverse(graph, w);
            } else {
                if (color[w] == color[n]) {
                    ok = false;
                }
            }
        }
    }
}
