// Last updated: 10/5/2025, 8:54:00 AM
class Solution {
    public int alternatingSum(int[] nums) {
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) evensum+=nums[i];
            else oddsum+=nums[i];
        }
        return evensum-oddsum;
    }
}