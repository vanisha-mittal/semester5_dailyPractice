// Last updated: 1/4/2026, 11:44:17 AM
1class Solution {
2    public int countSubstrings(String s) {
3        return count_palindromic(s);
4    }
5    public static int count_palindromic(String s) {
6		//odd
7		int odd=0;
8        for(int i=0;i<s.length();i++){
9            for(int j=0;i-j>=0 && i+j<s.length();j++){
10                if(s.charAt(i-j)!=s.charAt(i+j)) break;
11                odd++;
12            }
13        }
14        
15        int even=0;
16        for(double i=0.5;i<s.length();i++){
17            for(double j=0.5;i-j>=0 && i+j<s.length();j++){
18                if(s.charAt((int)(i-j))!=s.charAt((int)(i+j))) break;
19                even++;
20            }
21        }
22
23        return odd+even;
24	}
25
26}