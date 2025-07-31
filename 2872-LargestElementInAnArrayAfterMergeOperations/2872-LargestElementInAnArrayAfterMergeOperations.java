// Last updated: 7/31/2025, 5:13:24 PM
class Solution {
    public long maxArrayValue(int[] nums) {
        long ans = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; --i){
            if (nums[i] <= ans){
                ans += nums[i];
            }
            else{
                ans = nums[i];
            }
        }
        return ans;
    }
}