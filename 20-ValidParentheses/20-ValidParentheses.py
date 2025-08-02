# Last updated: 8/2/2025, 4:05:25 PM
class Solution(object):
    def isValid(self, s):
        if len(s)%2!=0:
            return False
        l=[]
        d={')':'(',']':'[','}':'{'}
        for i in s:
            if i in d.values():
                l.append(i)
            if i in d:
                if l==[]:
                    return False
                if l[-1]==d[i]:
                    l.pop()
                else:
                    return False
        if l!=[]:
            return False
        return True        
        """
        :type s: str
        :rtype: bool
        """
        