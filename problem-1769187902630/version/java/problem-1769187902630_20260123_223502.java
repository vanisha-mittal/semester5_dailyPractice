// Last updated: 1/23/2026, 10:35:02 PM
1class Solution {
2    public boolean isItPossible(String word1, String word2) {
3        int[] f1=new int[26];
4        int[] f2=new int[26];
5        for(char ch: word1.toCharArray()){
6            f1[ch-'a']++;
7        }
8        for(char ch: word2.toCharArray()){
9            f2[ch-'a']++;
10        }
11        for (int i = 0; i < 26; i++) {
12            for (int j = 0; j < 26; j++) {
13                if (!(f1[i] > 0 && f2[j] > 0)) {
14                    continue;
15                }
16                
17                f1[i]--; f2[i]++;   // frequency moves from f1 to f2
18                f2[j]--; f1[j]++;   // frequency moves from f2 to f1
19                
20                // if distinct counts are equal, return true right away
21                if (areCharsDistinct(f1, f2)) {
22                    return true;
23                } 
24    
25                // otherwise, revert the swap
26                f1[i]++; f2[j]++;
27                f1[j]--; f2[i]--;
28            }
29        }
30        
31        return false;
32    }
33
34    private boolean areCharsDistinct(int[] a, int[] b) {
35        int d1 = 0, d2 = 0;
36        for (int i = 0; i < 26; i++) {
37            if (a[i] > 0) d1++;
38            if (b[i] > 0) d2++;
39        }
40        
41        return d1 == d2;
42    }
43}