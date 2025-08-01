# Last updated: 8/1/2025, 2:26:18 PM
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans=[]
        for i in range(numRows):
            l=[]
            c=1 
            for j in range(i+1):
                l.append(c)
                c=c*(i-j)//(j+1)
            ans.append(l)
        return ans
        