// Last updated: 8/6/2026, 9:26:03 AM
1class Solution {
2    Integer[][][] dp;
3    public int cherryPickup(int[][] grid) {
4        int n=grid.length;
5        dp=new Integer[n][n][n];
6        int ans = cherry(grid,0,0,0);
7        return Math.max(0,ans);
8    }
9    public int cherry(int[][] grid,int r1,int c1,int r2) {
10        int c2=r1+c1-r2;
11        if(r1>=grid.length || r2>=grid.length || c1>=grid[0].length || c2>=grid[0].length || grid[r1][c1]==-1 || grid[r2][c2]==-1){
12            return Integer.MIN_VALUE;
13        }
14        if(r1==grid.length-1 && c1==grid[0].length-1){
15             return grid[r1][c1];
16        }
17        if(dp[r1][c1][r2]!=null){
18            return dp[r1][c1][r2];
19        }
20        int ch=0;
21        if(r1==r2 && c1==c2){
22            ch+=grid[r1][c1];
23        }else{
24            ch+=grid[r1][c1]+grid[r2][c2];
25        }
26        int a=cherry(grid,r1+1,c1,r2+1);
27        int b=cherry(grid,r1,c1+1,r2);
28        int c=cherry(grid,r1+1,c1,r2);
29        int d=cherry(grid,r1,c1+1,r2+1);
30        ch+=Math.max(Math.max(a,b),Math.max(c,d));
31        return dp[r1][c1][r2] = ch;
32    }    
33}