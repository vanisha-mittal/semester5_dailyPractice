// Last updated: 1/15/2026, 10:58:52 PM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        long ans=0;
4        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
5        for(int i=0;i<s.length();i++)
6            {
7                pq.add(nums[i]);
8                if(s.charAt(i)=='1')
9                {
10                    ans+=pq.poll();
11                }
12            }
13        return ans;
14    }
15}