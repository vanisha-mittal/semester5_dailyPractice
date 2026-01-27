// Last updated: 1/27/2026, 2:54:04 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        int i = 1, ans = 0;
4
5        while(i <= n){
6            ans = (ans + k) % i;
7            i++;
8        }
9        return ans+1;
10    }
11}