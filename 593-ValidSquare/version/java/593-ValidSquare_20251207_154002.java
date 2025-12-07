// Last updated: 12/7/2025, 3:40:02 PM
1class Solution {
2    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
3        Set<Integer> set = new HashSet();
4        set.add(distanceSquare(p1,p2));
5        set.add(distanceSquare(p1,p3));
6        set.add(distanceSquare(p1,p4));
7        set.add(distanceSquare(p2,p3));
8        set.add(distanceSquare(p2,p4));
9        set.add(distanceSquare(p3,p4));
10        return !set.contains(0) && set.size() == 2;
11    }
12    public int distanceSquare(int[] a, int[] b){
13        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
14    }
15}