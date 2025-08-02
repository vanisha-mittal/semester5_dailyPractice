# Last updated: 8/2/2025, 4:05:53 PM
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        l=nums1+nums2
        l.sort()
        if len(l)%2!=0:
            return float(l[len(l)//2])
        else:
            return (l[len(l)//2]+l[(len(l)//2)-1])/2.0       
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        