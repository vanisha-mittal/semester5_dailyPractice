// Last updated: 7/31/2025, 5:20:15 PM
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i-nums[i]>1 || i-nums[i]<-1)
            return false;
        }
        return true;
    }
}