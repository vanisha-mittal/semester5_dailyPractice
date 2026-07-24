// Last updated: 7/24/2026, 10:32:44 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4
5        int[] pairXor = new int[2048];
6        int[] tripleXor = new int[2048];
7
8        for (int i = 0; i < n; i++) {
9            for (int j = i; j < n; j++) {
10                pairXor[nums[i] ^ nums[j]] = 1;
11            }
12        }
13
14        for (int i = 0; i < n; i++) {
15            for (int j = 0; j < 2048; j++) {
16                if (pairXor[j] == 1) {
17                    tripleXor[j ^ nums[i]] = 1;
18                }
19            }
20        }
21
22        int cnt = 0;
23        for (int value : tripleXor) {
24            if (value == 1) {
25                cnt++;
26            }
27        }
28
29        return cnt;
30    }
31}