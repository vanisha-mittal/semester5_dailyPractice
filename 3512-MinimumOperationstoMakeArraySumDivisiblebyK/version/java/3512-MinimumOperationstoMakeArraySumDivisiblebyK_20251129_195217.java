// Last updated: 11/29/2025, 7:52:17 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum % k;
    }
}