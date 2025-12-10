// Last updated: 12/10/2025, 9:18:12 PM
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    public int countPermutations(int[] comp) {
5        int n = comp.length;
6        int first = comp[0];
7
8        for (int i = 1; i < n; i++) {
9            if (comp[i] <= first) return 0;
10        }
11
12        long fact = 1;
13        for (int i = 2; i < n; i++) {
14            fact = (fact * i) % MOD;
15        }
16
17        return (int) fact;
18    }
19}