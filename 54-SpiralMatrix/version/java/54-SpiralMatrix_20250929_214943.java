// Last updated: 9/29/2025, 9:49:43 PM
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    islands(grid, i, j);
                }
            }
        }
        
        return numIslands;
    }
    
    private void islands(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0'; 
        islands(grid, i + 1, j); 
        islands(grid, i - 1, j); 
        islands(grid, i, j + 1); 
        islands(grid, i, j - 1); 
    }
}