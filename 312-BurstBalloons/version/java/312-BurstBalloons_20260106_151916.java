// Last updated: 1/6/2026, 3:19:16 PM
1class Solution {
2    public int maxCoins(int[] nums) {
3        int[] a=new int[nums.length+2];
4        a[0]=a[a.length-1]=1;
5        for(int i=0;i<nums.length;i++){
6            a[i+1]=nums[i];
7        }
8        int[][] dp=new int[a.length][a.length];
9        return Burst_coin(a,0,a.length-1,dp);
10    }
11    public static int Burst_coin(int[] a, int i,int j,int[][]dp){
12        if(i+1==j){
13            return 0;
14        }
15        if(dp[i][j]!=0){
16            return dp[i][j];
17        }
18        int ans=Integer.MIN_VALUE;
19        for(int k=i+1;k<j;k++){
20            int left=Burst_coin(a,i,k,dp);
21            int right=Burst_coin(a,k,j,dp);
22            int self=a[i]*a[j]*a[k];
23            ans=Math.max(ans,left+right+self);
24        }
25        return dp[i][j]=ans;
26    }
27}