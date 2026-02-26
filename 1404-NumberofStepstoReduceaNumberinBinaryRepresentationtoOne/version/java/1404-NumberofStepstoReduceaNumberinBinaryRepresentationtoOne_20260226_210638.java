// Last updated: 2/26/2026, 9:06:38 PM
1class Solution {
2    public int numSteps(String s) {
3        int carry=0;
4        int ans=0;
5        for(int i=s.length()-1;i>0;i--){
6            int bit=(s.charAt(i)&1);
7            ans+=(1+(bit^carry));
8            carry|=bit;
9        }
10        return ans+carry;
11    }
12}