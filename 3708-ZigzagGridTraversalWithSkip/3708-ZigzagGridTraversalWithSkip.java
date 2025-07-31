// Last updated: 7/31/2025, 5:09:39 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> res = new ArrayList<>();
        int r=grid.length;
        int c=grid[0].length;
        int i=0;
        while(i<r){
            for (int j = 0; j < c&&i<r; j += 2) {
                res.add(grid[i][j]);
            }
            i++;
            if(c%2==0){
             for (int j = c - 1; j >= 0 && i<r; j -= 2) {
                    res.add(grid[i][j]);
                }
            }
            else{
                for (int j = c - 2; j >= 0 && i<r; j -= 2) {
                    res.add(grid[i][j]);
                }
            }
            i++;
        }
        return res;
    }
}