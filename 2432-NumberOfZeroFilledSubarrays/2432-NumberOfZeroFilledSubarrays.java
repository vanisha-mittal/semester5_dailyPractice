// Last updated: 8/24/2025, 8:43:39 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int n = nums.length;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                curr++;
            } else {
                ans += (1L * curr * (curr + 1) / 2);
                curr = 0;
            }
        }
        ans += (1L * curr * (curr + 1) / 2);
        return ans;
    }
}