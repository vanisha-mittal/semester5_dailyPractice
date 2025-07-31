# Last updated: 7/31/2025, 5:19:41 PM
class Solution:
    def numMagicSquaresInside(self, grid: List[List[int]]) -> int:
        c=0
        for i in range(len(grid)-2):
            for j in range(len(grid[0])-2):
                d=set()
                for a in range(i,i+3):
                    for b in range(j,j+3):
                        d.add(grid[a][b])
                        if 1>grid[a][b]>9:
                            return False
                if d==set(range(1,10)):
                    if grid[i][j] + grid[i][j+1] + grid[i][j+2] == grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2] ==grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2] ==grid[i][j] + grid[i+1][j] + grid[i+2][j] ==grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1] ==grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2] ==grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] ==grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j]:
                        c+=1
                
        return c
        