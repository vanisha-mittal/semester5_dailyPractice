// Last updated: 7/31/2025, 5:16:06 PM
class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        for(int i:nums){
            sum+=i;
        }
        long a=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            a+=nums[i];
            if(2*a>=sum){
                c++;
            }
        }
        return c;
    }
}