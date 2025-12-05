// Last updated: 12/5/2025, 7:17:15 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0, right = 0;
4        int sum = 0;
5        int ans = Integer.MAX_VALUE;
6
7        while (right < nums.length) {
8            sum += nums[right];
9            while (sum >= target) {
10                ans = Math.min(ans, right - left + 1);
11                sum -= nums[left];
12                left++;
13            }
14            right++;
15        }
16
17        return ans == Integer.MAX_VALUE ? 0 : ans;
18    }
19}