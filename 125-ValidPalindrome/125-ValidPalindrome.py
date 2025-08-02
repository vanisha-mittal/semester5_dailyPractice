# Last updated: 8/2/2025, 4:03:21 PM
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        str=''
        for i in s:
            if i in'1234567890qwertyuioplkjhgfdsazxcvbnm':
                str+=i
        return str==str[::-1]
        