# Last updated: 7/31/2025, 5:16:23 PM
class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        n = len(nums)
        window_size = sum(nums)
        one_cnt = sum(nums[n-window_size:n])
        res = window_size-one_cnt
        for i in range(n-1, -1, -1):
            one_cnt += nums[i-window_size]-nums[i]
            res = min(res, window_size-one_cnt)
        return res


        