// Last updated: 3/14/2026, 11:23:27 AM
1class Solution {
2    boolean isPrime(int x){
3        if(x < 2) return false;
4        if(x == 2) return true;
5        if(x % 2 == 0) return false;
6
7        for(int i = 3; i * i <= x; i += 2){
8            if(x % i == 0) return false;
9        }
10        return true;
11    }
12    public boolean completePrime(int n) {
13        int y = 0, z = 1, x = n;
14        while(x > 0) {
15            y = z * (x % 10) + y;
16            if(y == 1 || !isPrime(y)) return false;
17            if(x == 1 || !isPrime(x)) return false;
18            x /= 10; 
19            z *= 10;
20        }   
21        return true;
22
23
24    }
25}