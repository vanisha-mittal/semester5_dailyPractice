# Last updated: 8/2/2025, 4:03:25 PM
class Solution:
    def getRow(self, i: int) -> List[int]:
        from math import factorial
        l=[]
        for j in range(i+1):
            l.append(factorial(i)//(factorial(j)*factorial(i-j)))
        return l