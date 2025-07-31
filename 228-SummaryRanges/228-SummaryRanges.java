// Last updated: 7/31/2025, 5:21:49 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length > 0) {
            int start = 0;
            for (int i = 1; i <= nums.length; i++) {
                if (i == nums.length || nums[i] - nums[i - 1] != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nums[start]);
                    if (start != i - 1) {
                        sb.append("->").append(nums[i - 1]);
                    }
                    res.add(sb.toString());
                    start = i;
                }
            }
        }
        return res;
    }
}