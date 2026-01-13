// Last updated: 1/13/2026, 3:23:02 PM
1class Solution {
2    public int largestPrime(int n) {
3        boolean[] isPrime = fun(n);
4        ArrayList<Integer> primes = new ArrayList<>();
5        for (int i = 2; i <= n; i++) {
6            if (isPrime[i]) primes.add(i);
7        }
8
9        int sum = 0;
10        int ans = 0;
11        for (int p : primes) {
12            if (sum + p > n) break;
13
14            sum += p;
15
16            if (sum <= n && isPrime[sum]) {
17                ans = sum; 
18            }
19        }
20
21        return ans;
22    }
23    public static boolean[] fun(int n) {
24        boolean[] ans = new boolean[n + 1];
25        Arrays.fill(ans, true);
26
27        if (n >= 0) ans[0] = false;
28        if (n >= 1) ans[1] = false;
29
30        for (int i = 2; i * i <= n; i++) {
31            if (ans[i]) {
32                for (int j = i * i; j <= n; j += i) {
33                    ans[j] = false;
34                }
35            }
36        }
37        return ans;
38    }
39}