// Last updated: 1/19/2026, 3:50:28 PM
1public class Solution {
2    public boolean backspaceCompare(String S, String T) {
3        Stack<Character> st1=new Stack<>();
4        Stack<Character> st2=new Stack<>();
5        for(int i=0;i<S.length();i++){
6            if(S.charAt(i)!='#' ){
7                st1.push(S.charAt(i));
8            }
9            else {
10                if(!st1.isEmpty()) st1.pop();
11            }
12        }
13        for(int i=0;i<T.length();i++){
14            if(T.charAt(i)!='#' ){
15                st2.push(T.charAt(i));
16            }
17            else {
18                if(!st2.isEmpty()) st2.pop();
19            }
20        }
21        if(st1.size()!=st2.size()) return false;
22        while(!st1.isEmpty()){
23            if(st1.pop()!=st2.pop()) return false;
24        }
25        return true;
26    }
27}