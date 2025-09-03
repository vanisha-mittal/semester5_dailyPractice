// Last updated: 9/3/2025, 11:34:05 AM
class Solution {
    public int rob(int[] nums) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return Robber(nums,nums.length-1,dp);
    }
    public static int Robber(int[] arr,int i,int[] dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int rob=arr[i]+Robber(arr,i-2,dp);
        int dont_rob=Robber(arr,i-1,dp);
        return dp[i]=Math.max(rob,dont_rob);
    }
}