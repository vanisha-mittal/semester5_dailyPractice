// Last updated: 1/1/2026, 11:09:31 AM
1class Solution {
2    public int findCenter(int[][] edges) {
3
4        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
5            return edges[0][0];
6        }
7        return edges[0][1];
8    }
9}