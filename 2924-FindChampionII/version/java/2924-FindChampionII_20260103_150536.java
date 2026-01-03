// Last updated: 1/3/2026, 3:05:36 PM
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        boolean[] arr=new boolean[n];
4        for(int i=0;i<edges.length;i++){
5            arr[edges[i][1]]=true;
6
7        }
8        int idx=-1;
9        int c=0;
10        for(int i=0;i<n;i++){
11            if(arr[i]==false) {
12                idx=i;
13                c++;
14            }
15        }
16        if(c==1){
17            return idx;
18        }
19        return -1;
20    }
21}