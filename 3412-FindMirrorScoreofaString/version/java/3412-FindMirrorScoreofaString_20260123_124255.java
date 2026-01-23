// Last updated: 1/23/2026, 12:42:55 PM
1class Solution {
2    public long calculateScore(String s) {
3        Stack<Integer>[] arr = new Stack[26];
4        for (int i = 0; i < 26; i++) {
5            arr[i] = new Stack<>();
6        }
7
8        long ans=0;
9        for(int i=0;i<s.length();i++){
10            char ch=s.charAt(i);
11            if(arr['z'-ch].isEmpty()){
12                arr[ch-'a'].push(i);
13            }
14            else{
15                ans+=(i-arr['z'-ch].pop());
16            }
17        }
18        return ans;
19    }
20    
21}