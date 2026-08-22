// Last updated: 8/22/2026, 5:01:06 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum=0;
4        int p=1;
5        int a=n;
6        while(n!=0){
7            int d=n%10;
8            sum+=d;
9            p*=d;
10            n/=10;
11        }
12        return a%(sum+p)==0;
13    }
14}