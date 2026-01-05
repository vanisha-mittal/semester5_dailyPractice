// Last updated: 1/5/2026, 10:40:37 AM
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        List<String> result = new ArrayList<>();
4        int last = -1;
5        for (int i = 0; i < words.length; i++) {
6            if (groups[i] != last) {
7                result.add(words[i]);
8                last = groups[i];
9            }
10        }
11        return result;
12    }
13}