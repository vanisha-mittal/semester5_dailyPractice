// Last updated: 1/4/2026, 12:04:10 PM
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        String temp=word;
4        int c=0;
5        while(sequence.contains(temp)){
6            c++;
7            temp+=word;
8        }
9        return c;
10    }
11}