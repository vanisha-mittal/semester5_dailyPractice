// Last updated: 8/2/2025, 4:02:55 PM
class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2){
            return 0;
        }
        
        Arrays.sort(nums);
        int maxDiff = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
}