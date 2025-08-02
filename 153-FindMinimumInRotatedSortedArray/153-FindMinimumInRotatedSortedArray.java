// Last updated: 8/2/2025, 4:03:03 PM
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[hi]>=nums[mid]){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return nums[lo];
    }
}