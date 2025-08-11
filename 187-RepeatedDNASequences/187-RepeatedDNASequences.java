// Last updated: 8/11/2025, 9:30:34 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> s2 = new HashSet<>();
        Set<String> repeat = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            if (!s2.add(sub)) {
                repeat.add(sub);
            }
        }
        return new ArrayList<>(repeat);
    }
}