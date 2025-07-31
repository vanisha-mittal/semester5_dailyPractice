# Last updated: 7/31/2025, 5:15:51 PM
class Solution(object):
    def checkXMatrix(self, grid):
        n=len(grid[0])
        for i in range(n):
            for j in range(n):
                if (i==j or i+j==n-1) and grid[i][j]==0:
                    return False
                elif (i!=j and i+j!=n-1) and grid[i][j]!=0:
                    return False
        return True
        """
        :type grid: List[List[int]]
        :rtype: bool
        """
        