# Last updated: 8/2/2025, 4:05:43 PM
class Solution(object):
    def convert(self, s, numRows):
        if numRows == 1 or numRows >= len(s):
            return s
        index=0
        r=[[] for _ in range(numRows)]
        for i in s:
            r[index].append(i)
            if index==0:
                step=1
            elif index==numRows-1:
                step=-1
            index+=step
        for i in range(numRows):
            r[i]=''.join(r[i])
        return ''.join(r)
        
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        