// Last updated: 3/24/2026, 10:30:28 AM
1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3        final int MOD = 12345;
4        int n = grid.length, m = grid[0].length;
5
6        // Flatten grid
7        int N = n * m;
8        int[] arr = new int[N];
9        int idx = 0;
10
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < m; j++) {
13                arr[idx++] = grid[i][j] % MOD;
14            }
15        }
16
17        // Prefix and suffix arrays
18        int[] prefix = new int[N];
19        int[] suffix = new int[N];
20
21        for (int i = 0; i < N; i++) {
22            prefix[i] = 1;
23            suffix[i] = 1;
24        }
25
26        // Build prefix
27        for (int i = 1; i < N; i++) {
28            prefix[i] = (int)((1L * prefix[i - 1] * arr[i - 1]) % MOD);
29        }
30
31        // Build suffix
32        for (int i = N - 2; i >= 0; i--) {
33            suffix[i] = (int)((1L * suffix[i + 1] * arr[i + 1]) % MOD);
34        }
35
36        // Build result
37        int[][] res = new int[n][m];
38        idx = 0;
39
40        for (int i = 0; i < n; i++) {
41            for (int j = 0; j < m; j++) {
42                res[i][j] = (int)((1L * prefix[idx] * suffix[idx]) % MOD);
43                idx++;
44            }
45        }
46
47        return res;
48    }
49}