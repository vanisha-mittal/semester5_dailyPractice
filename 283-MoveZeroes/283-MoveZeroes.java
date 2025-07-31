// Last updated: 7/31/2025, 5:21:26 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        for(int j=i;j<nums.length;j++){
            nums[j]=0;
        }
    }
}