import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class traverseDAG797 {
    // 记录所有路径
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> path = new ArrayList<Integer>();

    public static List<List<Integer>> traverseDAG797(int[][] graph) {
        path.add(0);
        DFS(graph, 0);
        return res;
    }

    public static void DFS(int[][] graph, int node) {
        if (node == graph.length - 1) {
            //res.add(path);
            res.add(new ArrayList<Integer>(path)); // 深拷贝
            return;
        }
        for (int nextNode : graph[node]) {
            path.add(nextNode);
            DFS(graph, nextNode);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int [][] graph = {{1,2},{3},{3},{}};
        traverseDAG797(graph);
        for (List<Integer> i : res) {
            System.out.println(i);
        }
    }
}
