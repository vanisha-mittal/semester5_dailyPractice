// Last updated: 3/16/2026, 3:25:37 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int[] dp=new int[cost.length];
4        Arrays.fill(dp,-1);
5        return Math.min(stairs(cost,0,dp),stairs(cost,1,dp));
6    }
7    public int stairs(int[] cost, int idx, int[] dp){
8        if(idx>=cost.length) return 0;
9        if(dp[idx]!=-1) return dp[idx];
10        int a=stairs(cost,idx+1, dp);
11        int b=stairs(cost, idx+2, dp);
12        return dp[idx]=cost[idx]+Math.min(a,b);
13    }
14}