package ExhaustiveSearch;

public class maxAreaOfIsland695 {
    int res = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // for (int i = 0; i < m; i++) {
        //     dfs(grid, i , 0);
        //     dfs(grid, i, n-1);
        // }
        // for (int j = 0; j < n; j++) {
        //     dfs(grid, 0 , j);
        //     dfs(grid, m-1, j);
        // }
        // 这道题不需要预先处理
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    res  = Math.max(res, dfs(grid, i, j));
                }
            }
        }
        return res;
    }

    public int dfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return dfs(grid, i+1, j) + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i, j-1) + 1;
        // 注意要加1
    }
}
