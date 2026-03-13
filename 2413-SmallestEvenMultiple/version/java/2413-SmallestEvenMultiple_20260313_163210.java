// Last updated: 3/13/2026, 4:32:10 PM
1class Solution {
2    public int smallestEvenMultiple(int n) {
3        return n%2==0?n:n*2;
4    }
5    // public int gcd(int a, int b){
6    //     return b==0?a:gcd(b,a%b);
7    // }
8}