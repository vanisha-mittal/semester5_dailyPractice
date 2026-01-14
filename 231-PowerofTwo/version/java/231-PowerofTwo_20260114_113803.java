// Last updated: 1/14/2026, 11:38:03 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0){
4            return false;
5        }
6        return (n & (n-1))==0;
7    }
8}