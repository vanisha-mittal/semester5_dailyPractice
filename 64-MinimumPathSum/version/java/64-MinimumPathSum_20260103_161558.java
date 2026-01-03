// Last updated: 1/3/2026, 4:15:58 PM
1class Solution {
2    public int numSquares(int n) {
3        int[] dp=new int[n];
4        Arrays.fill(dp,-1);
5        return print(n,0,dp);
6    }
7    public int print(int n, int curr, int[] dp){
8        if(curr==n) return 0;
9        if(curr>n) return Integer.MAX_VALUE;
10        if(dp[curr]!=-1) return dp[curr];
11
12
13        int min=Integer.MAX_VALUE;
14        for(int i=1;i*i<=n;i++){
15            int c=Math.min(min,print(n,curr+i*i,dp));
16            if(c!=Integer.MAX_VALUE){
17                min=Math.min(min,c+1);
18            }
19        }
20        return dp[curr]=min;
21    }
22}