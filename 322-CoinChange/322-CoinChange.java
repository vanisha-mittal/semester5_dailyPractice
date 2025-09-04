// Last updated: 9/4/2025, 12:10:45 PM
class Solution {
    public int change(int amount, int[] coins) {
        return Coin_Change(coins, amount);
    }

    public static int Coin_Change(int[] coin, int amount) {
        int[][] dp = new int[coin.length+1][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int inc = 0;
                int exc = 0;
                if (j >= coin[i-1]) {
                    inc = dp[i][j - coin[i - 1]];
                }
                exc = dp[i - 1][j];
                dp[i][j] = inc + exc;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}