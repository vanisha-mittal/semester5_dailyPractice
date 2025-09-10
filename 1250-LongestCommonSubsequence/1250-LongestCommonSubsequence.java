// Last updated: 9/10/2025, 12:39:02 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return LCS(text1,text2);
    }
    public static int LCS(String s1,String s2){
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int ans=0;
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans=1+dp[i-1][j-1];
                }
                else{
                    int f=dp[i-1][j];
                    int s=dp[i][j-1];
                    ans=Math.max(f,s);
                }
                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}