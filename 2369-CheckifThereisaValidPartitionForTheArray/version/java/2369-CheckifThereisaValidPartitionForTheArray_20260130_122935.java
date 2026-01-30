// Last updated: 1/30/2026, 12:29:35 PM
1public class Solution {
2    public boolean validPartition(int[] nums) {
3        int n = nums.length;
4
5        if (n == 1) return false;
6
7        boolean[] dp = new boolean[]{true, false, n > 1 && nums[0] == nums[1]};
8
9        for (int i = 2; i < n; i++) {
10            boolean f = false;
11
12            if (nums[i] == nums[i-1] && dp[1]) {
13                f = true;
14            }
15            else if (nums[i] == nums[i-1] && nums[i] == nums[i-2] && dp[0]) {
16                f = true;
17            }
18            else if (nums[i] - nums[i-1] == 1 && nums[i-1] - nums[i-2] == 1 && dp[0]) {
19                f = true;
20            }
21
22            dp[0] = dp[1];
23            dp[1] = dp[2];
24            dp[2] = f;
25        }
26
27        return dp[2];
28    }
29}