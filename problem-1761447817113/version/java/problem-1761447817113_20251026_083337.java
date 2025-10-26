// Last updated: 10/26/2025, 8:33:37 AM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int si=0;
        int ei=nums.length-1;
        long ans=0;
        while(si<=ei){
            if(si==ei){ 
                ans+=(nums[ei]*nums[ei]);
                break;
            }
            ans+=(nums[ei]*nums[ei]);
            ans-=(nums[si]*nums[si]);
            ei--;
            si++;
        }
        return ans;
    }
}