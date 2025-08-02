# Last updated: 8/2/2025, 4:05:14 PM
class Solution(object):
    def longestValidParentheses(self, s):
        ml= 0
        l=0    
        r=0        
        for i in range(len(s)):
            if s[i]=='(':
                l+=1
            else:
                r+=1                        
            if l==r: 
                ml=max(ml,l*2)
            elif r>l: 
                l=r=0
        
        r=0
        l=0        
        for i in range(len(s)-1,-1,-1):
            if s[i]=='(':
                l+=1
            else:
                r+=1            
            if l==r:
                ml=max(ml,l*2)
            elif l>r: 
                l=r=0
        return ml
        """
        :type s: str
        :rtype: int
        """
        