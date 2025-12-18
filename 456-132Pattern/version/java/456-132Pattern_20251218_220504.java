// Last updated: 12/18/2025, 10:05:04 PM
1public class Solution {
2    public boolean find132pattern(int[] nums) {
3        Stack<Integer> st = new Stack<>();
4        int n = Integer.MIN_VALUE;
5
6        for (int i = nums.length - 1; i >= 0; i--) {
7            if (nums[i] < n) return true;
8            while (!st.isEmpty() && st.peek() < nums[i]) {
9                n = st.pop();
10            }
11            st.push(nums[i]);
12        }
13        return false;
14    }
15}