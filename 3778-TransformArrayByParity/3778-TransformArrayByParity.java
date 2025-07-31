// Last updated: 7/31/2025, 5:09:30 PM
class Solution {
    public int[] transformArray(int[] nums) {
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                o++;
            }
        }
        int i=nums.length-1;
        while(o>0 && i>=0){
            nums[i--]=1;
            o--;
        }
        while(i>=0){
            nums[i--]=0;
        }
        return nums;
    }
}