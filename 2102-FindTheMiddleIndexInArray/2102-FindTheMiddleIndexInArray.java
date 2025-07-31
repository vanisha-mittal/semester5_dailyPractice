// Last updated: 7/31/2025, 5:17:11 PM
class Solution {
    public int findMiddleIndex(int[] nums) {
        long sum=0;
        for(int i:nums){
            sum+=i;
        }
        long a=0;
        for(int i=0;i<nums.length;i++){
            if(a==(sum-a-nums[i])){
                return i;
            }
            a+=nums[i];
            
        }
        return -1;
    }
}