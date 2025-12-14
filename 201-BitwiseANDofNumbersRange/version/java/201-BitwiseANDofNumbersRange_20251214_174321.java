// Last updated: 12/14/2025, 5:43:21 PM
1class Solution {
2    public int rangeBitwiseAnd(int m, int n) {
3         while(n>m)
4           n = n & n-1;
5 return m&n;
6    }
7}