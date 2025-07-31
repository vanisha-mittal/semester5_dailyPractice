// Last updated: 7/31/2025, 5:20:54 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans =0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                ans=Math.max(ans,c);
                c=0;
            }
        }
        return Math.max(c,ans);
    }
}