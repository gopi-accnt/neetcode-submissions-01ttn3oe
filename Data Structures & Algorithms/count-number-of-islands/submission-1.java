class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int islands = 0;
        for(int r = 0; r<rows; r++) {
            for(int c = 0; c<cols; c++) {
                if(grid[r][c] == '1') {
                    islands++;
                    bfs(grid, r, c);
                }
            }
        }
        return islands;
    }

    public static int[][] dirs = {
        {1,0},
        {-1,0},
        {0,-1},
        {0,1}
    };

    public void bfs(char[][] grid, int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r,c});
        grid[r][c] = '0';

        while(!queue.isEmpty()) {
            int[] node = queue.poll();
            int row = node[0], column = node[1];
            for(int[] dir:dirs) {
                int nr = row + dir[0], nc = column + dir[1];
                if(nr >=0 && nc >=0 && nr < grid.length && nc < grid[0].length && 
                grid[nr][nc] == '1') {
                    grid[nr][nc] = '0';
                    queue.add(new int[]{nr, nc});
                }
            }
        }
    }
}
