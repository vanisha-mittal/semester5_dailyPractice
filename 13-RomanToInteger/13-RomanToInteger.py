# Last updated: 8/2/2025, 4:05:33 PM
class Solution(object):
    def romanToInt(self, s):
        r={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        n=0
        s = s.replace("IV", "IIII").replace("IX", "VIIII").replace("XL", "XXXX").replace("XC", "LXXXX").replace("CD", "CCCC").replace("CM", "DCCCC")
        return sum(map(r.get,s))
        """
        :type s: str
        :rtype: int
        """
        