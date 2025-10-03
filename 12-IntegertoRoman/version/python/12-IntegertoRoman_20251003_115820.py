# Last updated: 10/3/2025, 11:58:20 AM
class Solution(object):
    def intToRoman(self, num):
        r=[(1000,"M"),(900,"CM"),(500,"D"),(400,"CD"),(100,"C"),(90,"XC"),(50,"L"),(40,"XL"),(10,"X"),(9,"IX"),(5,"V"),(4,"IV"),(1,"I")]
        s=''
        for keys,values in r:
            while num>=keys:
                s+=values
                num-=keys
        return s
        """
        :type num: int
        :rtype: str
        """
        