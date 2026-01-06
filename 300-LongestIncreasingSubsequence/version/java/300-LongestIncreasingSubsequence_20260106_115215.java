// Last updated: 1/6/2026, 11:52:15 AM
1class Solution {
2    public int maxProfit(int[] arr) {
3        int n =  arr.length;
4        int[][] dp = new int[n + 2][2];
5
6        for (int i = n - 1; i >= 0; i--) {
7            dp[i][1] = Math.max(-arr[i] + dp[i + 1][0], dp[i + 1][1]);
8            dp[i][0] = Math.max(arr[i] + dp[i + 2][1], dp[i + 1][0]);
9        }
10
11        return dp[0][1];    
12    }
13    
14}