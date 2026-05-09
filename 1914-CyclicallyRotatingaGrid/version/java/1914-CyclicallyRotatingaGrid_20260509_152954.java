// Last updated: 5/9/2026, 3:29:54 PM
1class Solution {
2    public int[][] rotateGrid(int[][] grid, int k) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        int layers = Math.min(m, n) / 2;
8
9        for(int layer = 0; layer < layers; layer++) {
10
11            ArrayList<Integer> vals = new ArrayList<>();
12
13            int top = layer;
14            int left = layer;
15
16            int bottom = m - layer - 1;
17            int right = n - layer - 1;
18
19            // top row
20            for(int j = left; j <= right; j++) {
21                vals.add(grid[top][j]);
22            }
23
24            // right column
25            for(int i = top + 1; i <= bottom - 1; i++) {
26                vals.add(grid[i][right]);
27            }
28
29            // bottom row
30            for(int j = right; j >= left; j--) {
31                vals.add(grid[bottom][j]);
32            }
33
34            // left column
35            for(int i = bottom - 1; i >= top + 1; i--) {
36                vals.add(grid[i][left]);
37            }
38
39            int sz = vals.size();
40
41            int idx = k % sz;
42
43            // top row
44            for(int j = left; j <= right; j++) {
45
46                grid[top][j] = vals.get(idx);
47
48                idx++;
49
50                if(idx == sz) {
51                    idx = 0;
52                }
53            }
54
55            // right column
56            for(int i = top + 1; i <= bottom - 1; i++) {
57
58                grid[i][right] = vals.get(idx);
59
60                idx++;
61
62                if(idx == sz) {
63                    idx = 0;
64                }
65            }
66
67            // bottom row
68            for(int j = right; j >= left; j--) {
69
70                grid[bottom][j] = vals.get(idx);
71
72                idx++;
73
74                if(idx == sz) {
75                    idx = 0;
76                }
77            }
78
79            // left column
80            for(int i = bottom - 1; i >= top + 1; i--) {
81
82                grid[i][left] = vals.get(idx);
83
84                idx++;
85
86                if(idx == sz) {
87                    idx = 0;
88                }
89            }
90        }
91
92        return grid;
93    }
94}