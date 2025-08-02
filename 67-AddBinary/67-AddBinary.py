# Last updated: 8/2/2025, 4:04:22 PM
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a=int(int(a,2))
        b=int(int(b,2))
        return bin(a+b)[2:]