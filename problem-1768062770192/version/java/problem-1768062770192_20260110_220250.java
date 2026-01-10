// Last updated: 1/10/2026, 10:02:50 PM
1class Solution {
2    public int longestSubsequence(int[] arr, int d) {
3        Map<Integer, Integer> mp = new HashMap<>();
4        int mx = 0;
5        for (int i : arr) {
6            mp.put(i, mp.getOrDefault(i - d, 0) + 1);
7            mx = Math.max(mp.get(i), mx);
8        }
9        return mx;
10    }
11}