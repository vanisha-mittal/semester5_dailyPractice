// Last updated: 1/17/2026, 8:12:20 PM
1class Solution {
2    public int[] bestTower(int[][] towers, int[] center, int radius) {
3        int ans= -1;
4        int x= -1, y= -1;
5
6        for (int[] tower : towers) {
7            int q=tower[2];
8            int dist = Math.abs(tower[0] - center[0]) + Math.abs(tower[1] - center[1]);
9
10            if (dist <= radius) {
11                if (q > ans||
12                   (q == ans && 
13                   (tower[0] < x|| (tower[0] == x && tower[1]< y)))) {
14
15                    ans= q;
16                    x= tower[0];
17                    y= tower[1];
18                }
19            }
20        }
21
22        if (ans== -1) {
23            return new int[]{-1, -1};
24        }
25
26        return new int[]{x, y};
27    }
28}