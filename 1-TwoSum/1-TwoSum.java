// Last updated: 9/22/2025, 9:34:02 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] l=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    l[0]=i;
                    l[1]=j;
                    break;
                }
            }
        }
        return l;
    }
}