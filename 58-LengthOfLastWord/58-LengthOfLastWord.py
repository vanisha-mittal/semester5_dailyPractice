# Last updated: 8/2/2025, 4:04:33 PM
class Solution(object):
    def lengthOfLastWord(self, s):
        return len(s.split()[-1])
        """
        :type s: str
        :rtype: int
        """
        