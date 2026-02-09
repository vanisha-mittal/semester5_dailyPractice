// Last updated: 2/9/2026, 1:38:30 PM
1class KthLargest {
2    private PriorityQueue<Integer> pq;
3    private int k;
4
5    public KthLargest(int k, int[] nums) {
6        this.k = k;
7        pq = new PriorityQueue<>();
8
9        for (int num : nums) {
10            add(num);
11        }
12    }
13
14    public int add(int val) {
15        pq.offer(val);
16
17        if (pq.size() > k) {
18            pq.poll();   
19        }
20
21        return pq.peek(); 
22    }
23}
24
25
26/**
27 * Your KthLargest object will be instantiated and called as such:
28 * KthLargest obj = new KthLargest(k, nums);
29 * int param_1 = obj.add(val);
30 */