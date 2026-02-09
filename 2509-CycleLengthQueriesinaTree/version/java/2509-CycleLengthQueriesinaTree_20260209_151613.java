// Last updated: 2/9/2026, 3:16:13 PM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int[] ans=new int[queries.length];
4        int x=0;
5        for(int i=0;i<queries.length;i++){
6            int a=queries[i][0];
7            int b=queries[i][1];
8            int anc=ancestor(a,b);
9            ans[x++]=height(a)+height(b)-2*height(anc)+1;
10
11        }
12        return ans;
13    }
14    public static int ancestor(int a, int b){
15        while(a!=b){
16            if(a>b){
17                a/=2;
18            }
19            else{
20                b/=2;
21            }
22        }
23        return a;
24    }
25    public static int height(int a){
26        return ((int)(Math.log(a)/Math.log(2)));
27    }
28}