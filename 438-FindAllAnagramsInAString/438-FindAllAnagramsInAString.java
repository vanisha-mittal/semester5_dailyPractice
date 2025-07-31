// Last updated: 7/31/2025, 5:21:01 PM
class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int counter[] = new int[26];
        for (char ch : p.toCharArray()) {
            counter[ch - 'a']++;
        }

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        int k = p.length();
        while (j < n) {
            counter[s.charAt(j) - 'a']--;
            if (j - i + 1 == k) {
                if (allZero(counter)) {
                    result.add(i);
                }
                counter[s.charAt(i) - 'a']++;
                i++;
            }

            j++;
        }

        return result;

    }
     private boolean allZero(int counter[]) {
        for (int num : counter) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}