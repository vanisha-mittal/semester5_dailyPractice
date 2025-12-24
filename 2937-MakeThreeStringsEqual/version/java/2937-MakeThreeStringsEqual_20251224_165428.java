// Last updated: 12/24/2025, 4:54:28 PM
1public class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        int len = Math.min(s1.length(), Math.min(s2.length(), s3.length())); 
4        int sum = s1.length() + s2.length() + s3.length(); 
5        if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0) || s2.charAt(0) != s3.charAt(0)) {
6            return -1;
7        }
8
9        for (int i = 0; i < len; i++) {
10            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
11                sum -= 3; 
12            } else {
13                break; 
14            }
15        }
16
17        return sum; 
18    }
19}
20
21