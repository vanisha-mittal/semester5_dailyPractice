// Last updated: 1/3/2026, 12:44:18 PM
1class Solution {
2    public int rob(int[] nums) {
3        int[]dp=new int[nums.length];
4        Arrays.fill(dp,-1);
5        return Robber(nums,nums.length-1,dp);
6    }
7    public static int Robber(int[] arr,int i,int[] dp){
8        if(i<0){
9            return 0;
10        }
11        if(dp[i]!=-1){
12            return dp[i];
13        }
14
15        int rob=arr[i]+Robber(arr,i-2,dp);
16        int dont_rob=Robber(arr,i-1,dp);
17        return dp[i]=Math.max(rob,dont_rob);
18    }
19}