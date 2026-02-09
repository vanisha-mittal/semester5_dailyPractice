// Last updated: 2/9/2026, 3:18:11 PM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int[] ans=new int[queries.length];
4        int x=0;
5        for(int i=0;i<queries.length;i++){
6            int a=queries[i][0];
7            int b=queries[i][1];
8            int ah=0;
9            int bh=0;
10            while(a!=b){
11            if(a>b){
12                a/=2;
13                ah++;
14            }
15            else{
16                b/=2;
17                bh++;
18            }
19        }
20        ans[x++]=bh+ah+1;
21        }
22        return ans;
23    }
24    // public static int ancestor(int a, int b){
25    //     while(a!=b){
26    //         if(a>b){
27    //             a/=2;
28    //         }
29    //         else{
30    //             b/=2;
31    //         }
32    //     }
33    //     return a;
34    // }
35    // public static int height(int a){
36    //     return ((int)(Math.log(a)/Math.log(2)));
37    // }
38}