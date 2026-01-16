// Last updated: 1/16/2026, 10:59:15 PM
1class Solution {
2    public int xorOperation(int n, int start) {
3        int xor=0;
4        for(int i=0;i<n;i++){
5            xor^=(start+2*i);
6        }
7        return xor;
8    }
9}