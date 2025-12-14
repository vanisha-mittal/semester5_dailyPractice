// Last updated: 12/14/2025, 5:59:35 PM
1
2class Solution {
3    public int numSquares(int n) {
4        int[] dp = new int[n + 1];
5        Arrays.fill(dp, Integer.MAX_VALUE);
6        dp[0] = 0;
7        for (int i = 1; i <= n; ++i) {
8            int min_val = Integer.MAX_VALUE;
9            for (int j = 1; j * j <= i; ++j) {
10                min_val = Math.min(min_val, dp[i - j * j] + 1);
11            }
12            dp[i] = min_val;
13        }
14        return dp[n];
15    }
16}