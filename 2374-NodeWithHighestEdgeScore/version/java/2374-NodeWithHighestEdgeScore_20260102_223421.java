// Last updated: 1/2/2026, 10:34:21 PM
1class Solution {
2  public int edgeScore(int[] edges) {
3    int n = edges.length;
4    long[] arr = new long[n];
5    for (int i = 0; i < n; i++) {
6      arr[edges[i]] += i;
7    }
8
9    int result = 0;
10    for (int i = 0; i < n; i++) {
11      if (arr[i] > arr[result]) {
12        result = i;
13      }
14    }
15    return result;
16  }
17}