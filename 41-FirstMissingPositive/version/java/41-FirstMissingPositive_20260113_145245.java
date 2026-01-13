// Last updated: 1/13/2026, 2:52:45 PM
1public class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        for (int i = 0; i < n; i++) {
5            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
6                int temp = nums[i];
7                nums[i] = nums[temp - 1];
8                nums[temp - 1] = temp;
9            }
10        }
11        for (int i = 0; i < n; i++) {
12            if (nums[i] != i + 1) {
13                return i + 1; 
14            }
15        }
16        return n + 1;
17    }
18}