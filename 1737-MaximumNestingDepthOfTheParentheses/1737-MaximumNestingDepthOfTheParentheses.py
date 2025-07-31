# Last updated: 7/31/2025, 5:18:24 PM
class Solution(object):
    def maxDepth(self, s):
        c=0
        ans=0
        for i in s:
            c+=(i=='(')-(i==')')
            ans=max(c,ans)
        return ans
        """
        :type s: str
        :rtype: int
        """
        