// Last updated: 3/11/2026, 12:30:16 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0, maxLength = 0, zeros = 0;
4        for (int right = 0; right < nums.length; ++right) {
5            if (nums[right] == 0) {
6                zeros++;
7            }
8            while (zeros > k) {
9                if (nums[left] == 0) {
10                    zeros--;
11                }
12                left++;
13            }
14            maxLength = Math.max(maxLength, right - left + 1);
15        }
16        return maxLength;
17    }
18}