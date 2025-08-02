# Last updated: 8/2/2025, 4:05:00 PM
class Solution(object):
    def countAndSay(self, n):
        s='1'
        for i in range(n-1):
            char=s[0]
            ans=''
            count=0
            for c in s:
                if char==c:
                    count+=1
                else:
                    ans+=str(count)+char
                    char=c
                    count=1
            ans+=str(count)+char
            s=ans
        return s

            

        """
        :type n: int
        :rtype: str
        """
        