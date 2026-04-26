# Last updated: 4/26/2026, 5:09:04 PM
1class Solution:
2    def containsCycle(self, grid: List[List[str]]) -> bool:
3        rows = len(grid)
4        cols = len(grid[0])
5        visited = [[False] * cols for _ in range(rows)]
6        dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]
7
8        for row in range(rows):
9            for col in range(cols):
10                if visited[row][col]:
11                    continue
12                stack = [(row, col, -1, -1)]
13                visited[row][col] = True
14                while stack:
15                    cr, cc, pr, pc = stack.pop()
16                    for dr, dc in dirs:
17                        nr, nc = cr + dr, cc + dc
18                        if nr < 0 or nr >= rows or nc < 0 or nc >= cols:
19                            continue
20                        if grid[nr][nc] != grid[cr][cc]:
21                            continue
22                        if nr == pr and nc == pc:
23                            continue
24                        if visited[nr][nc]:
25                            return True
26                        visited[nr][nc] = True
27                        stack.append((nr, nc, cr,cc))
28
29
30        return False