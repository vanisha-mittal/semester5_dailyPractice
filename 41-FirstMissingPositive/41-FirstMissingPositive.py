# Last updated: 8/2/2025, 4:04:56 PM
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        d={}
        for i in nums:
            d[i]=i
        i=1
        while(True):
            try:
                d[i]
            except:
                return i
            i+=1