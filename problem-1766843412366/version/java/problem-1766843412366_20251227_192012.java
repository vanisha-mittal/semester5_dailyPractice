// Last updated: 12/27/2025, 7:20:12 PM
1class Solution {
2    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
3        Map<Integer, Integer> mpp = new HashMap<>();
4        int n = arrivals.length;
5        int i = 0, j = 0;
6        int cnt = 0;
7        while (j < n) {
8            int aj = arrivals[j];
9            mpp.put(aj, mpp.getOrDefault(aj, 0) + 1);
10            if (mpp.get(aj) > m) {
11                cnt++;
12                int newVal = mpp.get(aj) - 1;
13                if (newVal <= 0) mpp.remove(aj);
14                else mpp.put(aj, newVal);
15                arrivals[j] = 0;
16            }
17            if (j - i + 1 == w) {
18                int ai = arrivals[i];
19                int cur = mpp.getOrDefault(ai, 0) - 1;
20                if (cur <= 0) mpp.remove(ai);
21                else mpp.put(ai, cur);
22                i++;
23            }
24            j++;
25        }
26        return cnt;
27    }
28}