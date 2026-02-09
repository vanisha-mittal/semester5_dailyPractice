// Last updated: 2/9/2026, 3:20:40 PM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int[] ans=new int[queries.length];
4        int x=0;
5        for(int i=0;i<queries.length;i++){
6            int a=queries[i][0];
7            int b=queries[i][1];
8            int h=1;
9            while(a!=b){
10            if(a>b){
11                a/=2;
12            }
13            else{
14                b/=2;
15            }
16            h++;
17        }
18        ans[x++]=h;
19        }
20        return ans;
21    }
22    // public static int ancestor(int a, int b){
23    //     while(a!=b){
24    //         if(a>b){
25    //             a/=2;
26    //         }
27    //         else{
28    //             b/=2;
29    //         }
30    //     }
31    //     return a;
32    // }
33    // public static int height(int a){
34    //     return ((int)(Math.log(a)/Math.log(2)));
35    // }
36}