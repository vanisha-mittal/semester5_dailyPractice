// Last updated: 4/26/2026, 5:09:43 PM
1class Solution {
2    private int find(int x, int[] parent) {
3        while (parent[x] != x) {
4            parent[x] = parent[parent[x]];
5            x = parent[x];
6        }
7        return x;
8    }
9    private boolean unionSets(int a, int b, int[] parent) {
10        int ra = find(a, parent), rb = find(b, parent);
11        if (ra == rb) 
12            return true;
13        parent[ra] = rb;
14        return false;
15
16    }
17
18    public boolean containsCycle(char[][] grid) {
19        int rows = grid.length, cols = grid[0].length;
20        int[] parent = new int[rows * cols];
21        for (int i = 0; i < rows * cols; i++) 
22            parent[i] = i;
23        for (int i = 0; i < rows; i++) {
24            for (int j = 0; j < cols; j++) {
25                if (j + 1 < cols && grid[i][j] == grid[i][j + 1]) {
26                    if (unionSets(i * cols + j, i * cols + j + 1, parent)) 
27                        return true;
28                }
29                if (i + 1 < rows && grid[i][j] == grid[i + 1][j]) {
30                    if (unionSets(i * cols + j, (i + 1) * cols + j, parent)) 
31                        return true;
32                }
33            }
34        }
35        return false;
36    }
37}