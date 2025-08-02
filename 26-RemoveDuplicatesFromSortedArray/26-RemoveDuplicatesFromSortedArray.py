# Last updated: 8/2/2025, 4:05:20 PM
class Solution(object):
    def removeDuplicates(self, nums):
        nums[:]=sorted(set(nums))
        return len(nums)
        """
        :type nums: List[int]
        :rtype: int
        """
        