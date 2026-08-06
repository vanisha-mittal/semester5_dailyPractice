// Last updated: 8/6/2026, 9:21:48 AM
1class Solution {
2    Integer[][][][] dp;
3    public int cherryPickup(int[][] grid) {
4        int n=grid.length;
5        dp=new Integer[n][n][n][n];
6        int ans = cherry(grid,0,0,0,0);
7        return Math.max(0,ans);
8    }
9    public int cherry(int[][] grid,int r1,int c1,int r2,int c2) {
10        if(r1>=grid.length || r2>=grid.length || c1>=grid[0].length || c2>=grid[0].length || grid[r1][c1]==-1 || grid[r2][c2]==-1){
11            return Integer.MIN_VALUE;
12        }
13        if(r1==grid.length-1 && c1==grid[0].length-1){
14             return grid[r1][c1];
15        }
16        if(dp[r1][c1][r2][c2]!=null){
17            return dp[r1][c1][r2][c2];
18        }
19        int ch=0;
20        if(r1==r2 && c1==c2){
21            ch+=grid[r1][c1];
22        }else{
23            ch+=grid[r1][c1]+grid[r2][c2];
24        }
25        int a=cherry(grid,r1+1,c1,r2+1,c2);
26        int b=cherry(grid,r1,c1+1,r2,c2+1);
27        int c=cherry(grid,r1+1,c1,r2,c2+1);
28        int d=cherry(grid,r1,c1+1,r2+1,c2);
29        ch+=Math.max(Math.max(a,b),Math.max(c,d));
30        return dp[r1][c1][r2][c2] = ch;
31    }    
32}