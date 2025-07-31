# Last updated: 7/31/2025, 5:17:18 PM
class Solution(object):
    def addRungs(self, rungs, dist):
        c=0
        s=0
        for i in range(len(rungs)):
            gap=rungs[i]-s
            if gap>dist:
                c+=(gap-1)//dist
            s=rungs[i] 
        return c
        """
        :type rungs: List[int]
        :type dist: int
        :rtype: int
        """
        