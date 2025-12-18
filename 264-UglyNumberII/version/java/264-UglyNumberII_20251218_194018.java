// Last updated: 12/18/2025, 7:40:18 PM
1class Solution {
2    public int nthUglyNumber(int n) {
3        int[] primes = {2, 3, 5};
4        PriorityQueue<Long> uglyHeap = new PriorityQueue<>();
5        HashSet<Long> visited = new HashSet<>();
6        
7        uglyHeap.add(1L);
8        visited.add(1L);
9        
10        long curr = 1L;
11        for (int i = 0; i < n; i++) {
12            curr = uglyHeap.poll();
13            for (int prime : primes) {
14                long new_ugly = curr * prime;
15                if (!visited.contains(new_ugly)) {
16                    uglyHeap.add(new_ugly);
17                    visited.add(new_ugly);
18                }
19            }
20        }
21        return (int)curr;
22    }
23}