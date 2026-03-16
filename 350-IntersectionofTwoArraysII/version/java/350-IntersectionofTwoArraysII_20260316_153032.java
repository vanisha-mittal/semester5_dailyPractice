// Last updated: 3/16/2026, 3:30:32 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];

        dp[0] = cost[0];
        if (n > 1) {
            dp[1] = cost[1];
        }
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        int result = n == 1 ? 0 : Math.min(dp[n-1], dp[n-2]);
        return result; 
    }
}