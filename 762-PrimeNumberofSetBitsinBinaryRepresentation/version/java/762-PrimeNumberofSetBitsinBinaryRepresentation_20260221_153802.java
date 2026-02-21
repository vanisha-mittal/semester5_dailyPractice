// Last updated: 2/21/2026, 3:38:02 PM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int count = 0;
4        
5        for (int i = left; i <= right; i++) {
6            int setBits = Integer.bitCount(i); 
7            if (isPrime(setBits)) {
8                count++;
9            }
10        }
11        
12        return count;
13    }
14    
15    private boolean isPrime(int n) {
16        if (n < 2) return false;
17        for (int i = 2; i * i <= n; i++) {
18            if (n % i == 0) return false;
19        }
20        return true;
21    }
22}