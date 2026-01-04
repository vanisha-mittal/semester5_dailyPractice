// Last updated: 1/4/2026, 10:50:26 AM
1class Solution {
2    public int change(int amount, int[] coins) {
3        return Coin_Change(coins, amount);
4    }
5
6    public static int Coin_Change(int[] coin, int amount) {
7        int[][] dp = new int[coin.length+1][amount + 1];
8        for (int i = 0; i < dp.length; i++) {
9            dp[i][0] = 1;
10        }
11        for (int i = 1; i < dp.length; i++) {
12            for (int j = 1; j < dp[0].length; j++) {
13                int inc = 0;
14                int exc = 0;
15                if (j >= coin[i-1]) {
16                    inc = dp[i][j - coin[i - 1]];
17                }
18                exc = dp[i - 1][j];
19                dp[i][j] = inc + exc;
20            }
21        }
22        return dp[dp.length - 1][dp[0].length - 1];
23    }
24}