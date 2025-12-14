// Last updated: 12/14/2025, 5:57:19 PM
1
2
3
4class Solution {
5    public int[] findErrorNums(int[] nums) {
6        int n = nums.length;
7        int xorAll = 0;
8        int xorArray = 0;
9
10        for (int i = 1; i <= n; i++) {
11            xorAll ^= i;
12        }
13
14        for (int num : nums) {
15            xorArray ^= num;
16        }
17
18        int xorResult = xorArray ^ xorAll;
19
20        int rightmostSetBit = xorResult & -xorResult;
21
22        int xorSet = 0;
23        int xorNotSet = 0;
24
25        for (int i = 1; i <= n; i++) {
26            if ((i & rightmostSetBit) != 0) {
27                xorSet ^= i;
28            } else {
29                xorNotSet ^= i;
30            }
31        }
32
33        for (int num : nums) {
34            if ((num & rightmostSetBit) != 0) {
35                xorSet ^= num;
36            } else {
37                xorNotSet ^= num;
38            }
39        }
40
41        for (int num : nums) {
42            if (num == xorSet) {
43                return new int[]{xorSet, xorNotSet};
44            }
45        }
46
47        return new int[]{xorNotSet, xorSet};
48    }
49}
50
51
52