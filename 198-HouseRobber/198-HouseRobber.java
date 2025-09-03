// Last updated: 9/3/2025, 11:53:30 AM
class Solution {
    public int rob(int[] nums) {
        return Robber(nums);
    } 
    public static int Robber(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0], arr[1]);
        for(int i=2;i<dp.length;i++){
            int rob= arr[i]+dp[i-2];
            int dont_rob=dp[i-1];
            dp[i]=Math.max(rob,dont_rob);

        }
        return dp[dp.length-1];
    }
}