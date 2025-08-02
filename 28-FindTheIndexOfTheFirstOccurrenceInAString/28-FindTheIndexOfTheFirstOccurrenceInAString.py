# Last updated: 8/2/2025, 4:05:12 PM
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        l=len(needle)
        for i in range(len(haystack)-l+1):
            if haystack[i:i+l]==needle:
                return i
        return -1
        