class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int islandCount = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // 1. Scan every cell in the grid
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // 2. If we hit land, it's a new island!
                if (grid[r][c] == '1') {
                    islandCount++;
                    // 3. Flood fill the entire island to sink/visit it
                    dfs(grid, r, c);
                }
            }
        }

        return islandCount;
    }

    private void dfs(char[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Base case: Stop if out of bounds or if we hit water ('0')
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return;
        }

        // Sink the land (mark as visited) so we don't look at it again
        grid[r][c] = '0';

        // Recursively visit all 4 neighbor directions
        dfs(grid, r + 1, c); // Down
        dfs(grid, r - 1, c); // Up
        dfs(grid, r, c + 1); // Right
        dfs(grid, r, c - 1); // Left
    }
}