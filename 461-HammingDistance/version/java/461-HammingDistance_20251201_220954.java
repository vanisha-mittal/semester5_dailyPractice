// Last updated: 12/1/2025, 10:09:54 PM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int cnt=0;
4        
5        int c=x^y;
6        while(c>0){
7            c=c&c-1;
8            cnt++;
9        }
10        return cnt;
11    }
12}