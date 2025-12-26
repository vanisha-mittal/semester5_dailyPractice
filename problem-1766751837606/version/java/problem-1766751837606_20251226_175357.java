// Last updated: 12/26/2025, 5:53:57 PM
1class Solution {
2    public int minAbsoluteDifference(List<Integer> nums, int x) {
3        TreeMap<Integer, Integer> map = new TreeMap<>();
4        int n = nums.size();
5        for(int i = x; i < n; i++) {
6            int val = nums.get(i);
7            map.put(val, map.getOrDefault(val, 0)+1);
8        }
9        
10        int ans = Integer.MAX_VALUE;
11        for(int i = 0; i < (n-x); i++) {
12            int val = nums.get(i);
13            var flr = map.floorEntry(val);
14            var cel = map.ceilingEntry(val);
15            
16            if(flr != null) {
17                ans = Math.min(ans, val-flr.getKey());
18            }
19            if(cel != null) {
20                ans = Math.min(ans, cel.getKey()-val);
21            }
22            
23            val = nums.get(i+x);
24            if(map.get(val) == 1) {
25                map.remove(val);
26            } else {
27                map.put(val, map.get(val)-1);
28            }
29        }
30        
31        return ans;
32    }
33}