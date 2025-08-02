// Last updated: 8/2/2025, 4:05:28 PM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int j = 0; j < n - 3; j++) {
            if (j > 0 && nums[j] == nums[j - 1]) {
                continue;
            }
            for (int i = j + 1; i < n - 2; i++) {
                if (i > j + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int l = i + 1;
                int r = n - 1;
                while (l < r) {
                    long sum = (long) nums[j] + (long) nums[i] + (long) nums[l] + (long) nums[r];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[j], nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return result;
    }
}