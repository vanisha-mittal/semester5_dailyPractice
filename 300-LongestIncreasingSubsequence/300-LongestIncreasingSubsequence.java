// Last updated: 9/3/2025, 12:32:43 PM
class Solution {
    public int lengthOfLIS(int[] arr) {
        int[] dp=new int[arr.length];
        Arrays.fill(dp,1);
        for(int i=0;i<dp.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    int x=dp[j];
                    dp[i]=Math.max(dp[i],x+1);
                }
            }
        }
        int ans=dp[0];
        for(int i=1;i<dp.length;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}