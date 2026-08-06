// Last updated: 8/6/2026, 10:09:12 AM
1class Solution {
2    Integer[][][] dp;
3    public int cherryPickup(int[][] grid) {
4        int n=grid.length;
5        dp=new Integer[n][grid[0].length][grid[0].length];
6        int ans = cherry(grid,0,0,grid[0].length-1);
7        return Math.max(0,ans);
8    }
9    public int cherry(int[][] grid,int r1,int c1, int c2) {
10        if(r1>=grid.length || c1>=grid[0].length || c2>=grid[0].length ||r1<0||c1<0||c2<0|| grid[r1][c1]==-1 || grid[r1][c2]==-1){
11            return Integer.MIN_VALUE;
12        }
13        if(r1==grid.length-1){
14            if (c1 == c2)
15                return grid[r1][c1];
16            return grid[r1][c1] + grid[r1][c2];
17        }
18
19        if(dp[r1][c1][c2]!=null){
20            return dp[r1][c1][c2];
21        }
22        int ch=0;
23        if( c1==c2){
24            ch+=grid[r1][c1];
25        }else{
26            ch+=grid[r1][c1]+grid[r1][c2];
27        }
28        int a=cherry(grid,r1+1,c1-1,c2-1);
29        int b=cherry(grid,r1+1,c1-1,c2);
30        int c=cherry(grid,r1+1,c1-1,c2+1);
31        int d=cherry(grid,r1+1,c1,c2-1);
32        int e=cherry(grid,r1+1,c1,c2);
33        int f=cherry(grid,r1+1,c1,c2+1);
34        int g=cherry(grid,r1+1,c1+1,c2-1);
35        int h=cherry(grid,r1+1,c1+1,c2);
36        int i=cherry(grid,r1+1,c1+1,c2+1);
37
38        ch+= Math.max(Math.max(Math.max(a,b), Math.max(c,d)),Math.max(Math.max(Math.max(e,f), Math.max(g,h)),i));
39        return dp[r1][c1][c2] = ch;
40    }    
41}