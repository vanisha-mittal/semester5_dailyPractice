// Last updated: 3/21/2026, 7:34:39 PM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        for(int i=0;i<k/2;i++){
4            int si=x+i;
5            int ei=x+k-i-1;
6            for(int j=0;j<k;j++){
7                int temp=grid[si][y+j];
8                grid[si][y+j]=grid[ei][y+j];
9                grid[ei][y+j]=temp;
10            }
11        }
12        return grid;
13    }
14}