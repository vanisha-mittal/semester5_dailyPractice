// Last updated: 1/20/2026, 10:44:27 PM
1class Solution {
2    public long minMaxSubarraySum(int[] nums, int k) {
3        return minOrMaxSum(nums, k, true) + minOrMaxSum(nums, k, false);
4    }
5
6    private long minOrMaxSum(int[] nums, int k, boolean isMin) {
7        long sum = 0L;
8        int n = nums.length;
9        LinkedList<Integer> stack = new LinkedList<>();
10        stack.addFirst(-1);
11
12        for (int i = 0; i <= n; i++) {
13            while (stack.peekFirst() != -1 &&
14                (i == n ||
15                 (isMin && nums[stack.peekFirst()] >= nums[i]) || 
16                 (!isMin && nums[stack.peekFirst()] <= nums[i]))) {
17                
18                int middle = stack.removeFirst();
19                int left = stack.peekFirst() + 1;
20                int right = i - 1;
21                int minLeft = Math.max(left, middle - k + 1);
22                int maxRight = Math.min(middle + k - 1, right);
23                long subArrayCount = 0L;
24
25                if (maxRight - minLeft < k) {
26                    
27                    subArrayCount = (middle - minLeft + 1L) * (maxRight - middle + 1L);
28                } else {
29                    
30                    if (middle - minLeft < maxRight - middle) {
31                        for (int l = minLeft; l <= middle; l++) {
32                            int maxR = Math.min(right, l + k - 1);
33                            subArrayCount += Math.max(maxR - middle + 1, 0);
34                        }
35                    } else {
36                        for (int r = middle; r <= maxRight; r++) {
37                            int minL = Math.max(r - k + 1, left);
38                            subArrayCount += Math.max(middle - minL + 1, 0);
39                        }
40                    }
41                }
42
43                sum += subArrayCount * nums[middle];
44            }
45            stack.addFirst(i);
46        }
47
48        return sum;
49    }
50}