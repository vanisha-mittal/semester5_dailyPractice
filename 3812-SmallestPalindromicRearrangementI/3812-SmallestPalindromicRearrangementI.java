// Last updated: 7/31/2025, 5:09:27 PM
class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        int f[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i) - 'a']++;
        }
        char o = 0;
        for (int i = 0; i < 26; i++) {
            if (f[i] % 2 != 0) {
                o = (char) (i + 'a');
            }
        }
        StringBuilder half = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            int count = f[i] / 2;
            while (count-- > 0) {
                half.append(c);
            }
        }
        if (o != 0) {
            return half.toString() + o + half.reverse().toString();
        }
        return half.toString() + half.reverse().toString();
    }
}