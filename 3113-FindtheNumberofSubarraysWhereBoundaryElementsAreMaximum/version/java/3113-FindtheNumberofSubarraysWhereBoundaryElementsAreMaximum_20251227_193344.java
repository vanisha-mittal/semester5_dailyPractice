// Last updated: 12/27/2025, 7:33:44 PM
1class Solution {
2    public long numberOfSubarrays(int[] nums) {
3        long ans = 0;
4        Deque<int[]> stack = new ArrayDeque<>(); 
5
6        for (int n : nums) {
7            int count = 1;
8
9            
10            while (!stack.isEmpty() && stack.peek()[0] < n) {
11                stack.pop();
12            }
13
14            
15            if (!stack.isEmpty() && stack.peek()[0] == n) {
16                count += stack.peek()[1];
17                stack.peek()[1] = count;
18            } else {
19                stack.push(new int[]{n, count});
20            }
21
22            ans += count; 
23        }
24
25        return ans;
26    }
27}