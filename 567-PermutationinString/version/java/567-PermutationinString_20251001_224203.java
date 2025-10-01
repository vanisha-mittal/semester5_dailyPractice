// Last updated: 10/1/2025, 10:42:03 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLength = 0, zeros = 0;
        for (int right = 0; right < nums.length; ++right) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}