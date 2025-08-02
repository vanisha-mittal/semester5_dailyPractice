# Last updated: 8/2/2025, 4:05:40 PM
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        l=len(nums)
        nums.sort()
        ans=set()
        for i in range(l):
            j=i+1
            k=l-1
            while j<k:
                sum=nums[i]+nums[j]+nums[k]
                if sum==0:
                    ans.add((nums[i],nums[j],nums[k]))
                    j+=1
                    k-=1
                elif sum<0:
                    j+=1
                else:
                    k-=1
        return ans