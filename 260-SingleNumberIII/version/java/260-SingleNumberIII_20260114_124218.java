// Last updated: 1/14/2026, 12:42:18 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3
4        int xor = 0;
5        for (int i : nums) {
6            xor ^= i;
7        }
8
9        
10
11        int mask = (xor& (-xor));
12
13        int xor1 = 0;
14        for (int i : nums) {
15            if ((i & mask) != 0) {
16                xor1 ^= i;
17            }
18        }
19
20        return new int[]{xor1, xor1 ^ xor};
21    }
22}
23