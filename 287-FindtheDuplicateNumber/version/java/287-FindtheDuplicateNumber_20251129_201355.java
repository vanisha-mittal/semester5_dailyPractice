// Last updated: 11/29/2025, 8:13:55 PM
1
2public class Solution {
3    public int findDuplicate(int[] nums) {
4        Arrays.sort(nums); 
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] == nums[i - 1]) {
8                return nums[i]; 
9            }
10        }
11
12        return -1; 
13    }
14}