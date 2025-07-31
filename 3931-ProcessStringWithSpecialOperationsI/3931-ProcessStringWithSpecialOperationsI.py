# Last updated: 7/31/2025, 5:09:23 PM
class Solution(object):
    def processStr(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = []
        for ch in s:
            if 'a' <= ch <= 'z':    
                result.append(ch)
            elif ch == '*':          
                if result:
                    result.pop()
            elif ch == '#':          
                result += result[:]
            elif ch == '%':           
                result.reverse()

        return ''.join(result)