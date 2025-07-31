// Last updated: 7/31/2025, 5:20:49 PM
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
      
        int[] s = new int[nums.length + 1];
        s[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            s[i] = s[i - 1] + nums[i - 1];
      
        for (int start = 0; start < s.length; start++) {
            for (int end = start + 1; end < s.length; end++) {
                if (s[end] - s[start] == k)
                    c++;
            }
        }
      
        return c;
    }
}