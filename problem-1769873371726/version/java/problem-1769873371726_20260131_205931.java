// Last updated: 1/31/2026, 8:59:31 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int ans = 0;
4
5        for (int bit = 0; bit < 31; bit++) {
6            List<Integer> list = new ArrayList<>();
7
8            for (int x : nums) {
9                if ((x & (1 << bit)) != 0) {
10                    list.add(x);
11                }
12            }
13
14            if (list.isEmpty()) continue;
15
16            ans = Math.max(ans, lisLength(list));
17        }
18
19        return ans;
20    }
21
22    private int lisLength(List<Integer> arr) {
23        List<Integer> tails = new ArrayList<>();
24
25        for (int x : arr) {
26            int idx = Collections.binarySearch(tails, x);
27            if (idx < 0) idx = -idx - 1;
28
29            if (idx == tails.size()) {
30                tails.add(x);
31            } else {
32                tails.set(idx, x);
33            }
34        }
35        return tails.size();
36    }
37}