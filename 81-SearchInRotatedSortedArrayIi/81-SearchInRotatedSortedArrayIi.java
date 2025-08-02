// Last updated: 8/2/2025, 4:04:08 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[lo]==nums[mid] && nums[hi]==nums[mid]){
                lo++;
                hi--;
            }
            else if(nums[lo]<=nums[mid]){
                if(nums[lo]<=target && target<=nums[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
                if(nums[hi]>=target && target>=nums[mid]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return false;
    }
}