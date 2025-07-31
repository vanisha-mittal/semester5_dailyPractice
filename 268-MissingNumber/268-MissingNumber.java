// Last updated: 7/31/2025, 5:21:32 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int num_sum=0;
        for(int i=0;i<n;i++){
            num_sum+=nums[i];
        }
        return sum-num_sum;
        
    }
}