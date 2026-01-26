// Last updated: 1/26/2026, 6:32:08 PM
1class Solution {
2    private static final int MX = 50005;
3
4    public boolean[] sieveOfEratosthenes(int n) {
5        boolean[] prime = new boolean[n + 1];
6        Arrays.fill(prime, true);
7        prime[0] = false;
8        prime[1] = false;
9
10        for (int p = 2; p * p <= n; p++) {
11            if (prime[p]) {
12                for (int i = p * p; i <= n; i += p) {
13                    prime[i] = false;
14                }
15            }
16        }
17
18        return prime;
19    }
20
21    public int primeSubarray(int[] nums, int k) {
22        int n = nums.length;
23        boolean[] isPrime = sieveOfEratosthenes(MX);
24
25        int[] prefSum = new int[n];
26        prefSum[0] = isPrime[nums[0]] ? 1 : 0;
27        for (int i = 1; i < n; i++) {
28            prefSum[i] = prefSum[i - 1] + (isPrime[nums[i]] ? 1 : 0);
29        }
30
31        int[] startFrom = new int[n];
32        Arrays.fill(startFrom, -1);
33        for (int i = 0; i < n; i++) {
34            int start = i, end = n - 1, idx = -1;
35            while (start <= end) {
36                int mid = start + (end - start) / 2;
37                int total = prefSum[mid] - (i > 0 ? prefSum[i - 1] : 0);
38                if (total >= 2) {
39                    idx = mid;
40                    end = mid - 1;
41                } else {
42                    start = mid + 1;
43                }
44            }
45            startFrom[i] = idx;
46        }
47
48        int ans = 0;
49        TreeMap<Integer, Integer> primeCount = new TreeMap<>();
50        int j = 0;
51        for (int i = 0; i < n; i++) {
52            if (startFrom[i] == -1) break;
53
54            while (j < n) {
55                if (isPrime[nums[j]]) {
56                    primeCount.put(nums[j], primeCount.getOrDefault(nums[j], 0) + 1);
57                }
58
59                if (primeCount.size() >= 2) {
60                    int min = primeCount.firstKey();
61                    int max = primeCount.lastKey();
62                    if (max - min > k) {
63                        if (isPrime[nums[j]]) {
64                            int count = primeCount.get(nums[j]);
65                            if (count == 1) {
66                                primeCount.remove(nums[j]);
67                            } else {
68                                primeCount.put(nums[j], count - 1);
69                            }
70                        }
71                        break;
72                    }
73                }
74
75                j++;
76            }
77
78            if (j > startFrom[i]) {
79                ans += (j - startFrom[i]);
80            }
81
82            if (isPrime[nums[i]]) {
83                int count = primeCount.get(nums[i]);
84                if (count == 1) {
85                    primeCount.remove(nums[i]);
86                } else {
87                    primeCount.put(nums[i], count - 1);
88                }
89            }
90        }
91
92        return ans;
93    }
94}