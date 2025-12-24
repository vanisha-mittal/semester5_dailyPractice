// Last updated: 12/24/2025, 4:55:42 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        int[] freq1 = new int[26];
4        int[] freq2 = new int[26];
5
6        for (int i = 0; i < word1.length(); ++i) {
7            freq1[word1.charAt(i) - 'a']++;
8        }
9
10        for (int i = 0; i < word2.length(); ++i) {
11            freq2[word2.charAt(i) - 'a']++;
12        }
13
14        for (int i = 0; i < 26; ++i) {
15            if ((freq1[i] > 0 && freq2[i] == 0) || (freq2[i] > 0 && freq1[i] == 0)) {
16                return false; 
17            }
18        }
19
20        Arrays.sort(freq1);
21        Arrays.sort(freq2);
22
23        for (int i = 0; i < 26; ++i) {
24            if (freq1[i] != freq2[i]) {
25                return false; 
26            }
27        }
28        return true;
29    }
30}