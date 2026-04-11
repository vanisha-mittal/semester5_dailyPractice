// Last updated: 4/11/2026, 9:53:50 PM
1class Solution {
2    public int minimumDistance(int[] nums) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4        for (int i = 0; i < nums.length; i++) {
5  map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
6        }
7
8        int ans = Integer.MAX_VALUE;
9        boolean f = false;
10        for (List<Integer> idx : map.values()) {
11            if (idx.size() < 3) continue;
12
13           
14            for (int i = 0; i + 2 < idx.size(); i++) {
15                int a = idx.get(i);
16                int c = idx.get(i + 2);
17                int d = 2 * (c - a);  
18                ans = Math.min(ans, d);
19                f = true;
20    }
21        }
22
23        return f ? ans : -1;
24    }
25}