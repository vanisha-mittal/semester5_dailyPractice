# Last updated: 8/2/2025, 4:05:37 PM
class Solution(object):
    def maxArea(self, height):
        l=0
        r=len(height)-1
        w=0
        while l<r:
            if height[l]>height[r]:
                w=max(height[r]*(r-l),w)
                r-=1
            else:
                w=max(height[l]*(r-l),w)
                l+=1
        return w

        """
        :type height: List[int]
        :rtype: int
        """
        