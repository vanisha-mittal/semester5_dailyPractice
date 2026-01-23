// Last updated: 1/23/2026, 12:44:59 PM
1class Solution {
2    public long calculateScore(String str) {
3        Map<Character, Character> revMap = new HashMap<>();
4        for (char c = 'a'; c <= 'z'; ++c) {
5            revMap.put(c, (char) ('z' - (c - 'a')));
6        }
7
8        long total = 0;
9        Stack<Integer>[] stacks = new Stack[26];
10        for (int i = 0; i < 26; i++) {
11            stacks[i] = new Stack<>();
12        }
13
14        for (int idx = 0; idx < str.length(); ++idx) {
15            char curr = str.charAt(idx);
16            char mirror = revMap.get(curr);
17
18            if (!stacks[mirror - 'a'].isEmpty()) {
19                int prevIdx = stacks[mirror - 'a'].pop();
20                total += idx - prevIdx;
21            } else {
22                stacks[curr - 'a'].push(idx);
23            }
24        }
25
26        return total;
27    }
28}