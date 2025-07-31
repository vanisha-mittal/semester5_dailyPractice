// Last updated: 7/31/2025, 5:12:20 PM
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
            if(nums[i]==0){
                ans++;
            }
        }
        return ans;
        
    }
}