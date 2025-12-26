// Last updated: 12/26/2025, 9:28:24 PM
1class Solution {
2  public long minimumTime(int[] time, int totalTrips) {
3    long l = 1;
4    long r = Arrays.stream(time).min().getAsInt() * (long) totalTrips;
5
6    while (l < r) {
7      final long m = (l + r) / 2;
8      if (numTrips(time, m) >= totalTrips)
9        r = m;
10      else
11        l = m + 1;
12    }
13
14    return l;
15  }
16
17  private long numTrips(int[] time, long m) {
18    return Arrays.stream(time).asLongStream().reduce(0L, (subtotal, t) -> subtotal + m / t);
19  }
20}