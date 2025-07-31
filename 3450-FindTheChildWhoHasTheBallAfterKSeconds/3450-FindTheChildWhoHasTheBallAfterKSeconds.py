# Last updated: 7/31/2025, 5:12:08 PM
class Solution:
    def numberOfChild(self, n: int, k: int) -> int:
        k=k%(2*n-2)
        if k>=n:
            return 2*n-2-k
        return k
        