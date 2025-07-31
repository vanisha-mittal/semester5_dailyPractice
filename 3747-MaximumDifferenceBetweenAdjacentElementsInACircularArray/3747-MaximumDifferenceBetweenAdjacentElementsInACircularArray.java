// Last updated: 7/31/2025, 5:09:34 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            ans=Math.max(ans,Math.abs(nums[i]-nums[i+1]));
        }
        return Math.max(ans,Math.abs(nums[0]-nums[nums.length-1]));
    }
}