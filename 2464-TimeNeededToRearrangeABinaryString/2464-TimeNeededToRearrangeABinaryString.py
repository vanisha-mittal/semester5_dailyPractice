# Last updated: 7/31/2025, 5:15:48 PM
class Solution:
    def secondsToRemoveOccurrences(self, s: str) -> int:
        c=0
        while '01' in s:
            s=s.replace('01','10')
            c+=1
        return c
        
        