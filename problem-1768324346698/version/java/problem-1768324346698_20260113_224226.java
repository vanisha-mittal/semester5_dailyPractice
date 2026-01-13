// Last updated: 1/13/2026, 10:42:26 PM
1class Solution {
2    public int minOperations(int n, int m) {
3         if(!notPrime(n) || !notPrime(m) ){
4            return -1;
5        } 
6        if(n==m){
7            return n;
8        }
9       
10        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[1] - y[1]);
11        Set<Integer> set = new HashSet<>();
12        pq.add(new int[] { n, n });
13        set.add(n);
14        while (!pq.isEmpty()) {
15            int[] curr = pq.remove();
16            int temp = curr[0];
17            int idx = 0;
18            while (temp != 0) {
19                int dig = temp % 10;
20                if (dig != 0) { 
21                    int n1 = curr[0] - (int) Math.pow(10, idx);
22                    if (n1 == m) {
23                        return curr[1] + n1;
24                    }
25                    if (!set.contains(n1) && notPrime(n1)) {
26                        set.add(n1);
27                        pq.add(new int[] { n1, curr[1] + n1 });
28                    }
29                }
30                if (dig != 9) { 
31                    int n1 = curr[0] + (int) Math.pow(10, idx);
32                    if (n1 == m) {
33                        return curr[1] + n1;
34                    }
35                    if (!set.contains(n1) && notPrime(n1)) {
36                        set.add(n1);
37                        pq.add(new int[] { n1, curr[1] + n1 });
38                    }
39                }
40                idx++;
41                temp /= 10;
42            }
43        }
44        return -1;
45
46    }
47
48    private boolean notPrime(int n) {
49        if ( n == 2 || n == 3 || n == 5) {
50            return false;
51        }
52        if (n==1 || n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
53            return true;
54        }
55        for (int i = 7; i <= Math.sqrt(n); i++) {
56            if (n % i == 0) {
57                return true;
58            }
59        }
60        return false;
61    }
62}