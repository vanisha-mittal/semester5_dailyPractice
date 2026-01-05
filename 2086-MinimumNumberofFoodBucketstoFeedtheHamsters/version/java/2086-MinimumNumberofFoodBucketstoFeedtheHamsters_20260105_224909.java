// Last updated: 1/5/2026, 10:49:09 PM
1class Solution {
2    public int minimumBuckets(String hamsters) {
3        int buckets = 0 ;
4        int n = hamsters.length() ;
5        
6        for (int i = 0; i < n; i++)
7            if (hamsters.charAt(i) == 'H') {
8                if (i+1 < n && hamsters.charAt(i+1) == '.') {
9                    buckets++ ;
10                    i += 2 ;
11                }
12                else if (i-1 >= 0 && hamsters.charAt(i-1) == '.') buckets++ ;
13                else return -1 ;
14            }
15        
16        return buckets ;
17    }
18}
19
20