// Last updated: 1/20/2026, 10:41:24 PM
1class Solution {
2    public int maximumLength(String s) {
3        int n=s.length();
4        int freq[][]=new int[26][n+1];
5        char prev=s.charAt(0);
6        freq[prev-'a'][1]=1;
7        int max=-1;
8        int length=1;
9        for(int i=1;i<s.length();i++){
10            char curr=s.charAt(i);
11            if(prev==curr){
12                length++;
13                freq[s.charAt(i)-'a'][length]++;
14            }
15            else{
16                length=1;
17                freq[s.charAt(i)-'a'][length]++;
18                prev=curr;
19            }
20        }
21        for(int i=0;i<26;i++){
22            int sum=0;
23            for(int j=n;j>=1;j--){
24                sum+=freq[i][j];
25                if(sum>=3)
26                    max=Math.max(max,j);
27            }
28        }
29        return max;
30    }
31}