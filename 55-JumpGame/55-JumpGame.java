// Last updated: 8/2/2025, 4:04:37 PM
class Solution {
    public boolean canJump(int[] nums) {
        int i = nums.length-1;
        for(int idx = nums.length-2;idx>=0;idx--){
            if(nums[idx]+idx >= i){
                i=idx;
            }
        } 

        return i==0;
    }
}