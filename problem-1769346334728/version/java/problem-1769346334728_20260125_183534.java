// Last updated: 1/25/2026, 6:35:34 PM
1class Solution {
2    int mod = (int) 1e9 + 7;
3
4    public int maxProfit(int[] inventory, int orders) {
5        long profit = 0;
6        int k = smallestK(inventory, orders);
7
8        for (int inv : inventory) {
9            if (inv > k) {
10                profit = (profit + 1L * (inv + k + 1) * (inv - k) / 2) % mod;
11                orders -= inv - k;
12            }
13        }
14        return (int) ((profit + 1L * orders * k) % mod);
15    }
16
17    int smallestK(int[] inventory, int target) {
18        int max = Integer.MIN_VALUE;
19        for (int inv : inventory)
20            max = Math.max(max, inv);
21
22        int left = 0, right = max;
23        while (left < right) {
24            int mid = left + (right - left) / 2;
25            if (sum(inventory, mid) > target)
26                left = mid + 1;
27            else
28                right = mid;
29        }
30        return left;
31    }
32
33    long sum(int[] inventory, int k) {
34        long sum = 0;
35        for (int i : inventory) {
36            if (i > k)
37                sum += i - k;
38        }
39        return sum;
40    }
41}