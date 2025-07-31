# Last updated: 7/31/2025, 5:11:48 PM
class Solution:
    def clearDigits(self, s: str) -> str:
        ans=[]
        for i in s:
            if i.isdigit():
                ans.pop()
            else:
                ans.append(i)
        return ''.join(ans)
        