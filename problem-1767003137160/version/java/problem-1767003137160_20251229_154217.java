// Last updated: 12/29/2025, 3:42:17 PM
1class Solution {
2    public int findMinimumTime(List<Integer> strength, int K) {
3        return fun(strength, K, new HashMap<>(), 0);
4    }
5
6    static int fun(List<Integer> strength, int K, Map<Integer, Integer> dp, int state) {
7        if (Integer.bitCount(state) == strength.size()) {
8            return 0;
9        }
10        if (dp.containsKey(state)) {
11            return dp.get(state);
12        }
13        int res = Integer.MAX_VALUE, factor = K * Integer.bitCount(state) + 1;
14        for (int i = 0; i < strength.size(); i++) {
15            if (((1 << i) & state) == 0) {
16                int diff = strength.get(i) / factor + (strength.get(i) % factor == 0 ? 0 : 1);
17                res = Math.min(res, diff + fun(strength, K, dp, state | (1 << i)));
18            }
19        }
20        dp.put(state, res);
21        return res;
22    }
23}