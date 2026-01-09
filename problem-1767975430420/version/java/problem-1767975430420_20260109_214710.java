// Last updated: 1/9/2026, 9:47:10 PM
1class Solution {
2    public int maximumLength(int[] nums, int k) {
3        int dp[][] = new int[k][k], max = 0;
4        for (int i = 0; i < nums.length; i++) {
5            for (int j = 0; j < k; j++) {
6                max = Math.max(max, dp[nums[i] % k][j] = dp[j][nums[i] % k] + 1);
7            }
8        }
9        return max;
10    }
11}