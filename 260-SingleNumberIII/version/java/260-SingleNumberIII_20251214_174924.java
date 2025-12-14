// Last updated: 12/14/2025, 5:49:24 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int xor2no = 0;
4        for (int num : nums) {
5            xor2no ^= num;
6        }
7
8        int lowestBit = xor2no & (-xor2no);
9
10        int[] result = new int[2];
11        for (int num : nums) {
12            if ((lowestBit & num) == 0) {
13                result[0] ^= num;
14            } else {
15                result[1] ^= num;
16            }
17        }
18
19        return result;
20    }
21}