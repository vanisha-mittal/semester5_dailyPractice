// Last updated: 7/31/2025, 5:21:24 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i=1; i<dp.length;i++){
            int min=amount+1;
            for(int coin:coins){
                if(i-coin<0){
                    continue;
                }
                int curr = 1 + dp[i-coin];
                if(curr < min){
                    min = curr;
                }
            }
            dp[i] = min;
        }
        if(dp[amount]>amount){
            return -1;
        }
        return dp[amount];
    }
}