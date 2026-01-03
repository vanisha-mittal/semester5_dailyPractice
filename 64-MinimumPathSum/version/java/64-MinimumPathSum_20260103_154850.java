// Last updated: 1/3/2026, 3:48:50 PM
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum=0;
4        for(int i:nums){
5            sum+=i;
6        }
7        if(sum%2!=0) return false;
8        int total=sum/2;
9        Boolean[][] dp=new Boolean[nums.length][total+1];
10        return print(nums,total,0,0,dp);
11    }
12    public static boolean print(int[] arr, int total, int i,int curr, Boolean[][]dp){
13        if(curr==total) return true;
14        if(i>=arr.length || curr > total) return false;
15        if(dp[i][curr]!=null) return dp[i][curr];
16
17        boolean add=print(arr,total,i+1,curr+arr[i],dp);
18        boolean not_add=print(arr,total,i+1,curr,dp);
19
20        return dp[i][curr]=add||not_add;
21    }
22}