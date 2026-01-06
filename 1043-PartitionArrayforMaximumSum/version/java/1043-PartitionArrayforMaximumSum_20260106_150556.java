// Last updated: 1/6/2026, 3:05:56 PM
1class Solution {
2    public int maxSumAfterPartitioning(int[] arr, int k) {
3        int[] dp=new int[arr.length];
4        Arrays.fill(dp,-1);
5        return partition(arr,k,0,dp);
6    }
7    public int partition(int[] arr, int k, int idx,int[]dp){
8        if(idx>=arr.length) return 0;
9        if(dp[idx]!=-1) return dp[idx];
10
11        int sum=0;
12        int len=0;
13        int max=0;
14        int ans=Integer.MIN_VALUE;
15        for(int i=idx;i<arr.length && len<k ;i++){
16            len++;
17            max=Math.max(arr[i],max);
18
19            sum=len*max+partition(arr, k,i+1,dp);
20            ans=Math.max(ans,sum);
21        }
22        return dp[idx]=ans;
23    }
24}