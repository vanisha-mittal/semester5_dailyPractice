// Last updated: 7/31/2025, 5:15:40 PM
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int bit = 0;
        int ans = 1;
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            while ((bit & nums[r]) != 0) {
                bit ^= nums[l++];
            }
            bit |= nums[r];
            ans=Math.max(ans,r-l+1);
            r++;

        }

        return ans;

    }
}