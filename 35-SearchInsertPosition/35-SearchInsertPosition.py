# Last updated: 8/2/2025, 4:05:08 PM
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        l=len(nums)
        c=0
        for i in nums[::-1]:
            if i<target:
                return -c+l
            c+=1
        return 0
        