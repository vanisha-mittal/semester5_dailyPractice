// Last updated: 1/14/2026, 12:41:25 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3
4        int xor = 0;
5        for (int i : nums) {
6            xor ^= i;
7        }
8
9        int a = xor;
10        int c = 0;
11
12        while ((xor & 1) == 0) {
13            c++;
14            xor >>= 1;
15        }
16
17        int mask = 1 << c;
18
19        int xor1 = 0;
20        for (int i : nums) {
21            if ((i & mask) != 0) {
22                xor1 ^= i;
23            }
24        }
25
26        return new int[]{xor1, xor1 ^ a};
27    }
28}
29