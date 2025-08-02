# Last updated: 8/2/2025, 4:03:13 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return sum(set(nums))*2-sum(nums)
            
        