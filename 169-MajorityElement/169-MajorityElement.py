# Last updated: 8/2/2025, 4:02:56 PM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        dict = {}
        count, itm = 0, ''
        for item in reversed(nums):
            dict[item] = dict.get(item, 0) + 1
            if dict[item] >= count :
                count, itm = dict[item], item
        return(itm)