# Last updated: 8/2/2025, 4:04:21 PM
class Solution(object):
    def mySqrt(self, x):
        if x==0 or x==1:
            return x
        start=1
        end=x
        mid=0
        while start<=end:
            mid=(start+end)//2
            if mid*mid<x:
                start=mid
            elif mid*mid>x:
                end=mid
            else:
                return mid
            if start+1==end:
                return start



        """
        :type x: int
        :rtype: int
        """
        