// Last updated: 12/29/2025, 3:34:02 PM
1class Solution {
2    public int subsetXORSum(int[] nums) {
3        int ans = 0;
4        for (int num : nums) {
5            ans |= num;
6        }
7        return ans *(int) Math.pow(2,nums.length-1); 
8    }
9}