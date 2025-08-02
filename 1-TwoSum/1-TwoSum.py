# Last updated: 8/2/2025, 4:05:55 PM
class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    return [i,j]
                    
            
        
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        