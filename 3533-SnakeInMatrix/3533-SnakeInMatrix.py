# Last updated: 7/31/2025, 5:10:05 PM
class Solution:
    def finalPositionOfSnake(self, n: int, commands: List[str]) -> int:
        grid=[]
        a=0
        for i in range(n):
            l=[]
            for j in range(n):
                l.append(a)
                a+=1
            grid.append(l)
        a=0
        b=0
        for i in commands:
            if i=="DOWN":
                a+=1
            elif i=="UP":
                a-=1
            elif i=="RIGHT":
                b+=1
            else:
                b-=1
        return grid[a][b]
        

        