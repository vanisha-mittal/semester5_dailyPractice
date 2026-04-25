// Last updated: 4/25/2026, 4:56:59 PM
1class Solution {
2public:
3    int lengthOfLongestSubstring(string s) {
4        int n = s.length();
5        int maxLength = 0;
6        unordered_set<char> charSet;
7        int left = 0;
8        
9        for (int right = 0; right < n; right++) {
10            if (charSet.count(s[right]) == 0) {
11                charSet.insert(s[right]);
12                maxLength = max(maxLength, right - left + 1);
13            } else {
14                while (charSet.count(s[right])) {
15                    charSet.erase(s[left]);
16                    left++;
17                }
18                charSet.insert(s[right]);
19            }
20        }
21        
22        return maxLength;
23    }
24};