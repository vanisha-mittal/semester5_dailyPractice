// Last updated: 9/18/2025, 12:22:15 PM
class Solution {
    public int maxCoins(int[] nums) {
        int[] a=new int[nums.length+2];
        a[0]=a[a.length-1]=1;
        for(int i=0;i<nums.length;i++){
            a[i+1]=nums[i];
        }
        int[][] dp=new int[a.length][a.length];
        return Burst_coin(a,0,a.length-1,dp);
    }
    public static int Burst_coin(int[] a, int i,int j,int[][]dp){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int ans=Integer.MIN_VALUE;
        for(int k=i+1;k<j;k++){
            int left=Burst_coin(a,i,k,dp);
            int right=Burst_coin(a,k,j,dp);
            int self=a[i]*a[j]*a[k];
            ans=Math.max(ans,left+right+self);
        }
        return dp[i][j]=ans;
    }
}