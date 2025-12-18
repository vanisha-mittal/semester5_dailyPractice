// Last updated: 12/18/2025, 7:35:38 PM
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int n = s.length();
4        int[] ar = new int[n];
5        int i = 0, j = 0;
6        int temp = Integer.MAX_VALUE;
7
8        while (j < n) {
9            if (s.charAt(j) == c) {
10                while (i <= j) {
11                    ar[i] = Math.min(Math.abs(j - i), Math.abs(temp - i));
12                    i++;
13                }
14                temp = j;
15            }
16            j++;
17        }
18        while (i < n) {
19            ar[i] = Math.abs(temp - i);
20            i++;
21        }
22
23        return ar;
24    }
25}