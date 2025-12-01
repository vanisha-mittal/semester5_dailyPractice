// Last updated: 12/1/2025, 10:03:15 PM
1class Solution {
2    public long maxRunTime(int n, int[] batteries) {
3        long totalEnergy = 0;
4        for (int battery : batteries) {
5            totalEnergy += battery;
6        }
7
8        Arrays.sort(batteries);
9
10        for (int i = batteries.length - 1; i >= 0; i--) {
11            if (batteries[i] > totalEnergy / n) {
12                totalEnergy -= batteries[i];
13                n--;
14            } else {
15                break;
16            }
17        }
18
19        return totalEnergy / n;
20    }
21}