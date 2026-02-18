// Last updated: 2/18/2026, 11:06:08 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        while(n != 0){
4            int l = n & 1;
5            int sl = (n >> 1) & 1;
6            if((l ^ sl) == 0) return false;
7            n = n >> 1;
8        }
9        return true;
10    }
11}