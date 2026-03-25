// Last updated: 3/25/2026, 10:31:40 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4
5        long[] rowSum = new long[m];
6        long[] colSum = new long[n];
7        long total = 0;
8
9        // Compute sums
10        for (int i = 0; i < m; i++) {
11            for (int j = 0; j < n; j++) {
12                rowSum[i] += grid[i][j];
13                colSum[j] += grid[i][j];
14                total += grid[i][j];
15            }
16        }
17
18        if (total % 2 != 0) return false;
19
20        if (check(rowSum, total)) return true;
21        if (check(colSum, total)) return true;
22
23        return false;
24    }
25
26    private boolean check(long[] arr, long total) {
27        long left = arr[0];
28        long right = total - left;
29
30        for (int i = 1; i < arr.length; i++) {
31            if (left == right) return true;
32            else if (left > right) return false;
33            left += arr[i];
34            right -= arr[i];
35        }
36
37        return false;
38    }
39}