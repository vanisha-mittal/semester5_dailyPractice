// Last updated: 12/11/2025, 2:43:02 PM
1class Solution {
2    public int countCoveredBuildings(int n, int[][] buildings) {
3        int[] minRow = new int[n + 1], maxRow = new int[n + 1];
4        int[] minCol = new int[n + 1], maxCol = new int[n + 1];
5        Arrays.fill(minRow, Integer.MAX_VALUE);
6        Arrays.fill(maxRow, Integer.MIN_VALUE);
7        Arrays.fill(minCol, Integer.MAX_VALUE);
8        Arrays.fill(maxCol, Integer.MIN_VALUE);
9
10        for (int[] building : buildings) {
11            int x = building[0];
12            int y = building[1];
13            minRow[x] = Math.min(minRow[x], y);
14            maxRow[x] = Math.max(maxRow[x], y);
15            minCol[y] = Math.min(minCol[y], x);
16            maxCol[y] = Math.max(maxCol[y], x);
17        }
18
19        int coveredCount = 0;
20
21        for (int[] building : buildings) {
22            int x = building[0];
23            int y = building[1];
24
25            boolean hasLeft = minRow[x] < y;
26            boolean hasRight = maxRow[x] > y;
27            boolean hasAbove = minCol[y] < x;
28            boolean hasBelow = maxCol[y] > x;
29            if (hasLeft && hasRight && hasAbove && hasBelow) {
30                coveredCount++;
31            }
32        }
33
34        return coveredCount;
35    }
36}