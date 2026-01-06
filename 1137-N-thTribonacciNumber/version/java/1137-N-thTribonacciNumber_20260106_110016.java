// Last updated: 1/6/2026, 11:00:16 AM
1class Solution {
2    public int tribonacci(int n) {
3        int[] dp=new int[n+1];
4        Arrays.fill(dp,-1);
5        return fibo(n,dp);
6    }
7    public static int fibo(int n,int[] dp){
8        if(n==0) return 0;
9        if(n==1 || n==2) return 1;
10        if(dp[n]!=-1) return dp[n];
11        return dp[n]= fibo(n-1,dp)+fibo(n-2,dp)+fibo(n-3,dp);
12    }
13}