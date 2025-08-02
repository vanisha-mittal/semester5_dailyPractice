# Last updated: 8/2/2025, 4:05:39 PM
class Solution(object):
    def isPalindrome(self, x):
        if x<0 or x%10==0 and x!=0:
            return False
        return str(x)[::-1]==str(x)
        """
        :type x: int
        :rtype: bool
        """
        