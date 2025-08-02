// Last updated: 8/2/2025, 4:03:04 PM
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int min=1;
        int max=1;
        int res=Integer.MIN_VALUE;
        for(int i:nums){
            int temp=max*i;
            max=Math.max(temp,Math.max(min*i,i));
            min=Math.min(temp,Math.min(min*i,i));
            res=Math.max(res,max);
        }
        return res;

    }
}