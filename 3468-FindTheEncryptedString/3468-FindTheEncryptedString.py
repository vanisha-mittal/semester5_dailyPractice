# Last updated: 7/31/2025, 5:11:28 PM
class Solution:
    def getEncryptedString(self, s: str, k: int) -> str:
        n=len(s)
        return s[k%n:]+s[:k%n]
        