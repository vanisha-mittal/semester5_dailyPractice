// Last updated: 8/11/2025, 9:30:47 PM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=0;i<k/2;i++){
            int si=x+i;
            int ei=x+k-i-1;
            for(int j=0;j<k;j++){
                int temp=grid[si][y+j];
                grid[si][y+j]=grid[ei][y+j];
                grid[ei][y+j]=temp;
            }
        }
        return grid;
    }
}