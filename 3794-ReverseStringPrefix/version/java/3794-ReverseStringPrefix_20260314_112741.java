// Last updated: 3/14/2026, 11:27:41 AM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        StringBuilder sp = new StringBuilder();
4        sp.append(s);
5        for(int i = 1; i <= k; i++){
6            sp.setCharAt(i-1,s.charAt(k-i));
7        }
8        return sp.toString();
9    }
10}