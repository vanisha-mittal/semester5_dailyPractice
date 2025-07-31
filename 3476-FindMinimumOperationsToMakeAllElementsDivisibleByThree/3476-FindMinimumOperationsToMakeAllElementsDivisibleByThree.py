# Last updated: 7/31/2025, 5:11:11 PM
class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        su=0
        for n in nums:
            if n%3!=0:
                su+=1
        return su