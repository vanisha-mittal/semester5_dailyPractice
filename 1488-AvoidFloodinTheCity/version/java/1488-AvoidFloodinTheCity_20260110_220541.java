// Last updated: 1/10/2026, 10:05:41 PM
1class Solution {
2    public int[] avoidFlood(int[] rains) {
3        int n = rains.length;
4        Map<Integer, Integer> lake = new HashMap<>();
5        TreeSet<Integer> dryDays = new TreeSet<>();
6        int[] res = new int[n];
7        
8        for (int i = 0; i < n; i++) {
9            if (rains[i] == 0) {
10                dryDays.add(i);
11                res[i] = 1;
12            } else {
13                res[i] = -1;
14                if (lake.containsKey(rains[i])) {
15                    Integer dryDay = dryDays.ceiling(lake.get(rains[i]));
16                    if (dryDay == null) return new int[0];
17                    res[dryDay] = rains[i];
18                    dryDays.remove(dryDay);
19                }
20                lake.put(rains[i], i);
21            }
22        }
23        return res;
24    }
25}