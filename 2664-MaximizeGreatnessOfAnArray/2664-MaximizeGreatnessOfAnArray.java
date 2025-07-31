// Last updated: 7/31/2025, 5:14:42 PM
import java.util.Arrays;

class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = 0, count = 0;

        while (j < n) {
            if (nums[j] > nums[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}
