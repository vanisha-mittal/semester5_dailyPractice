// Last updated: 1/13/2026, 3:06:19 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min=Integer.MAX_VALUE;
4        int max=0;
5        for(int i:prices){
6            min=Math.min(min,i);
7            max=Math.max(max,i-min);
8        }
9        return max;
10    }
11}