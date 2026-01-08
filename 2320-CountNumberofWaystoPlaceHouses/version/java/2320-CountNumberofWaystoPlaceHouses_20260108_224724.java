// Last updated: 1/8/2026, 10:47:24 PM
1class Solution {
2    private int MOD = 1_000_000_007 ;
3    public int countHousePlacements(int n) {
4        int[] dp = new int[n+1] ;
5        Arrays.fill(dp,-1) ;
6        fibo(n,dp) ;
7        return (int)((1L * dp[n] * dp[n]) % MOD);
8    }
9    public int fibo(int n , int[] dp){
10        if(n==1)return dp[1] = 2 ;
11        if(n==2)return dp[2] = 3 ;
12        if(dp[n]!=-1)return dp[n] ;
13        return dp[n] = (fibo(n-1,dp)+fibo(n-2,dp))%MOD ;
14    }
15}