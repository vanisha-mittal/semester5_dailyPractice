// Last updated: 8/2/2025, 4:05:16 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}