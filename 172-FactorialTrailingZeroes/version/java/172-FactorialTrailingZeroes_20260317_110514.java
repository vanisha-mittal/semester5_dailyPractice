// Last updated: 3/17/2026, 11:05:14 AM
1class Solution {
2    public int addDigits(int num) {
3         if(num==0) return 0;
4         if(num%9==0) return 9;
5         else return num%9;
6    }
7}