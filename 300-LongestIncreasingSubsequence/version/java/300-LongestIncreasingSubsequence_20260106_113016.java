// Last updated: 1/6/2026, 11:30:16 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[][]dp=new int[prices.length][2];
4        for(int[] i:dp){
5            Arrays.fill(i,-1);
6        }
7        return bestTime(prices, 0, 1,dp);
8    }
9    public static int bestTime(int[] arr, int i,int can_buy, int[][]dp){
10        if(i>=arr.length) return 0;
11        if(dp[i][can_buy]!=-1) return dp[i][can_buy];
12
13        int profit;
14        if(can_buy==1){
15            int buy=bestTime(arr,i+1,0,dp)-arr[i];
16            int not_buy=bestTime(arr,i+1,1,dp);
17            profit=Math.max(buy,not_buy);
18        }
19        else{
20            int sell=bestTime(arr,i+2,1,dp)+arr[i];
21            int not_sell=bestTime(arr,i+1,0,dp);
22            profit=Math.max(sell,not_sell);
23        }
24
25        return dp[i][can_buy]=profit;
26    }
27}