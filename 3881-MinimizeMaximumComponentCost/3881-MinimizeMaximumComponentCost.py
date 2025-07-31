# Last updated: 7/31/2025, 5:09:21 PM
class Solution(object):
    def minCost(self, n, edges, k):
        """
        :type n: int
        :type edges: List[List[int]]
        :type k: int
        :rtype: int
        """
        

        p = list(range(n))
        def find(u):
            while u != p[u]:
                p[u] = p[p[u]]
                u = p[u]
            return u

        def union(u, v):
            pu, pv = find(u), find(v)
            if pu == pv:
                return False
            p[pu] = pv
            return True

        edges.sort(key=lambda x: x[2])
        me = []
        for u, v, w in edges:
            if union(u, v):
                me.append(w)

        me.sort(reverse=True)
        for _ in range(k - 1):
            if me:
                me.pop(0) 

        return 0 if not me else max(me)