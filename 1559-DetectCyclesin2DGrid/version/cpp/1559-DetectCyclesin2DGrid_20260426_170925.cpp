// Last updated: 4/26/2026, 5:09:25 PM
1class Solution {
2public:
3    int find(int x, vector<int>& parent) {
4        while (parent[x] != x) {
5            parent[x] = parent[parent[x]];
6            x = parent[x];
7        }
8        return x;
9    }
10
11    bool union_sets(int a, int b, vector<int>& parent) {
12        int ra = find(a, parent), rb = find(b, parent);
13        if (ra == rb) 
14            return true;
15        parent[ra] = rb;
16        return false;
17    }
18
19    bool containsCycle(vector<vector<char>>& grid) {
20        int rows = grid.size(), cols = grid[0].size();
21        vector<int> parent(rows * cols);
22        for (int i = 0; i < rows * cols; i++) 
23            parent[i] = i;
24        for (int i = 0; i < rows; i++) {
25            for (int j = 0; j < cols; j++) {
26                if (j + 1 < cols && grid[i][j] == grid[i][j + 1]) {
27                    if (union_sets(i * cols + j, i * cols + j + 1, parent)) 
28                        return true;
29                }
30                if (i + 1 < rows && grid[i][j] == grid[i + 1][j]) {
31                    if (union_sets(i * cols + j, (i + 1) * cols + j, parent)) 
32                        return true;
33                }
34            }
35        }
36        return false;
37    }
38};