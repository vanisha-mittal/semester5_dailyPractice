// Last updated: 11/29/2025, 8:03:49 PM
1class Solution {
2  public int singleNumber(int[] nums) {
3    int ans = 0;
4
5    for (int i = 0; i < 32; ++i) {
6      int sum = 0;
7      for (final int num : nums)
8        sum += num >> i & 1;
9      sum %= 3;
10      ans |= sum << i;
11    }
12
13    return ans;
14  }
15}