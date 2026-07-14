// Last updated: 7/14/2026, 10:07:35 PM
1class Solution {
2    public int rob(int[] nums) {
3        int[]dp=new int[nums.length+1];
4        return Robber(nums,dp);
5    }
6    // public static int Robber(int[] arr,int i,int[] dp){
7    //     if(i<0){
8    //         return 0;
9    //     }
10    //     if(dp[i]!=-1){
11    //         return dp[i];
12    //     }
13
14    //     int rob=arr[i]+Robber(arr,i-2,dp);
15    //     int dont_rob=Robber(arr,i-1,dp);
16    //     return dp[i]=Math.max(rob,dont_rob);
17    // }
18    public static int Robber(int[] arr,int[] dp){
19        int n=arr.length;
20        dp[n-1]=arr[n-1];
21        for(int i=n-2;i>=0;i--){
22            dp[i]=Math.max(arr[i]+dp[i+2],dp[i+1]);
23        }
24        return dp[0];
25        
26    }
27}