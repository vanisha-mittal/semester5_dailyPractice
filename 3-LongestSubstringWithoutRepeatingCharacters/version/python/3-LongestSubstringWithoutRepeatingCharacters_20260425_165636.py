# Last updated: 4/25/2026, 4:56:36 PM
1class Solution:
2    def lengthOfLongestSubstring(self, s: str) -> int:
3        n = len(s)
4        maxLength = 0
5        charSet = set()
6        left = 0
7        
8        for right in range(n):
9            if s[right] not in charSet:
10                charSet.add(s[right])
11                maxLength = max(maxLength, right - left + 1)
12            else:
13                while s[right] in charSet:
14                    charSet.remove(s[left])
15                    left += 1
16                charSet.add(s[right])
17        
18        return maxLength