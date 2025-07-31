# Last updated: 7/31/2025, 5:18:38 PM
class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        d1={}
        d2={}
        for i in arr:
            if i not in d1:
                d1[i]=0
            d1[i]+=1
        for i in target:
            if i not in d2:
                d2[i]=0
            d2[i]+=1
        return [True,False][d1!=d2]
        