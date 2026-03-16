// Last updated: 3/16/2026, 3:03:57 PM
1class Solution {
2    public boolean isUgly(int n) {
3        if(n<1){
4            return false;
5        }
6        while(n%2==0){
7            n=n/2;
8        }
9        while(n%3==0){
10            n=n/3;
11        }
12        while(n%5==0){
13            n=n/5;
14        }
15        if(n==1){
16            return true;
17        }
18        return false;
19    }
20}