// Last updated: 9/26/2025, 11:26:17 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int l = 0, r = 0, i = 0;

        while (r < nums.length) {
            while (!q.isEmpty() && nums[q.peekLast()] < nums[r]) {
                q.pollLast();
            }

            q.addLast(r);

            if (q.peekFirst() < l) {
                q.pollFirst();
            }
            if (r - l + 1 >= k) {
                ans[i++] = nums[q.peekFirst()];
                l++; 
            }
            r++;
        }
        return ans;
    }
}