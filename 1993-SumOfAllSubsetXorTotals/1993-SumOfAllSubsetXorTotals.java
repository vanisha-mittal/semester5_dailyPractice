// Last updated: 7/31/2025, 5:17:24 PM
class Solution {
    public int subsetXORSum(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans |= num;
        }
        return ans *(int) Math.pow(2,nums.length-1); 
    }
}