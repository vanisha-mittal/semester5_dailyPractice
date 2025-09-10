// Last updated: 9/10/2025, 12:36:03 PM
class Solution {
    public int minOperations(int[] nums) {
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=a){
                return 1;
            }
        }
        return 0;
    }
}