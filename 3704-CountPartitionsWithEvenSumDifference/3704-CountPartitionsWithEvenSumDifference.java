// Last updated: 7/31/2025, 5:09:40 PM
class Solution {
    public int countPartitions(int[] nums) {
        int[] left=new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i];
        }
        int c=0;
        int sum=left[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs((sum-left[i])-left[i])%2==0){
                c++;
            }
        }
        return c;
    }
}