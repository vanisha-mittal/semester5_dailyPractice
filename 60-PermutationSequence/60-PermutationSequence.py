# Last updated: 8/2/2025, 4:04:30 PM
class Solution(object):
    def getPermutation(self, n, k):
        from itertools import permutations
        l=[x for x in range(1,n+1)]
        p=list(permutations(l))
        s=list(map(str,p[k-1]))
        return ''.join(s)
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        