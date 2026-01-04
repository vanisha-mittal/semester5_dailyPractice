// Last updated: 1/4/2026, 3:23:37 PM
1class Solution {
2    public int numDecodings(String s) {
3        int[] dp=new int[s.length()];
4        Arrays.fill(dp,-1);
5        return decode(s,0,dp);
6    }
7    public int decode (String s, int i, int[] dp){
8        if(s.length()==i)  return 1;
9        if(s.charAt(i)=='0') return 0;
10        if(dp[i]!=-1) return dp[i];
11
12        int c=0;
13        c+=decode(s,i+1,dp);
14
15        if(i+1<s.length()){
16            int val=Integer.parseInt(s.substring(i,i+2));
17            if(val<=26){
18                c+=decode(s,i+2,dp);
19            }
20        }
21
22        return dp[i]=c;
23    }
24}