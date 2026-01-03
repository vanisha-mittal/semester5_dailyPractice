// Last updated: 1/3/2026, 2:53:12 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int[][] dp=new int[grid.length][grid[0].length];
4        for(int[] i:dp){
5            Arrays.fill(i,-1);
6        }
7        return Minimum_Path(grid,0,0,dp);
8    }
9    public static int Minimum_Path(int [][] grid, int cr, int cc,int[][]dp){
10        if(cr==grid.length-1 && cc==grid[0].length-1){
11            return grid[cr][cc];
12        }
13        if(cc==grid[0].length || cr==grid.length){
14            return Integer.MAX_VALUE;
15        }
16        if(dp[cr][cc]!=-1){
17            return dp[cr][cc];
18        }
19        int d=Minimum_Path(grid,cr+1,cc,dp);
20        int r=Minimum_Path(grid,cr,cc+1,dp);
21        return dp[cr][cc]=Math.min(d,r)+grid[cr][cc];
22    }
23}