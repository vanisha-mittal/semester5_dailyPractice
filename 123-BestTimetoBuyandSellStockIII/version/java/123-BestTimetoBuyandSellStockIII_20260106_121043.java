// Last updated: 1/6/2026, 12:10:43 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[][]dp=new int[prices.length][4];
4        for(int[] i:dp){
5            Arrays.fill(i,-1);
6        }
7        return bestTime(prices, 0, 0,dp);
8    }
9    public static int bestTime(int[] arr, int i,int op, int[][]dp){
10        if(i>=arr.length) return 0;
11        if(op==4) return 0;
12        if(dp[i][op]!=-1) return dp[i][op];
13
14        int profit=0;
15        if(op%2==0){
16            int buy=bestTime(arr,i+1,op+1,dp)-arr[i];
17            int not_buy=bestTime(arr,i+1,op,dp);
18            profit=Math.max(buy,not_buy);
19        }
20        else{
21            int sell=bestTime(arr,i+1,op+1,dp)+arr[i];
22            int not_sell=bestTime(arr,i+1,op,dp);
23            profit=Math.max(sell,not_sell);
24        }
25
26        return dp[i][op]=profit;
27    }
28}