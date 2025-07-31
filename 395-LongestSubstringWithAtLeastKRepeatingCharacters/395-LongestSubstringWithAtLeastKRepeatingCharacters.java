// Last updated: 7/31/2025, 5:21:02 PM
class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (char c : counts.keySet()) {
            if (counts.get(c) < k) {
                int maxLen = 0;
                for (String sub : s.split(String.valueOf(c))) {
                    maxLen = Math.max(maxLen, longestSubstring(sub, k));
                }
                return maxLen;
            }
        }
        return n;
    }
}