// Last updated: 9/4/2025, 11:35:23 AM
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[amount+1][coins.length];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return Coin_Change(coins,amount,0,dp);
    }
    public static int Coin_Change(int[] coin, int amount, int i, int [][] dp){
        if(amount==0){
            return 1;
        }
        if(i==coin.length){
            return 0;
        }
        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        int inc=0;
        int exc=0;
        if(amount>=coin[i]){
            inc=Coin_Change(coin, amount-coin[i], i, dp);
        }
        exc=Coin_Change(coin, amount, i+1, dp);
        return dp[amount][i]=exc+inc;
    }
}