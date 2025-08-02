// Last updated: 8/2/2025, 4:03:02 PM
class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<nums[hi]){
                hi=mid;
            }
            else if(nums[mid]>nums[hi]){
                lo=mid+1;
            }
            else{
                hi=hi-1;
            }
        }
        return nums[lo];
    }
}