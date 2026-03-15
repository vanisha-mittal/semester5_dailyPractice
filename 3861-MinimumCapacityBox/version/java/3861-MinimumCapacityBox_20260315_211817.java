// Last updated: 3/15/2026, 9:18:17 PM
1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3        
4        int idx = -1;
5        int min = Integer.MAX_VALUE;
6        int n = capacity.length;
7        for(int i=0;i<n;i++){
8            if(capacity[i]>=itemSize){
9                if(capacity[i]<min){
10                    idx = i;
11                    min = capacity[i];
12                }
13            }
14        }
15        return idx;
16    }
17}