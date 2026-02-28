// Last updated: 2/28/2026, 8:07:33 PM
1class Solution {
2    public int[] minDistinctFreqPair(int[] nums) {
3        HashMap<Integer, Integer> hm = new HashMap<>();
4        
5        for (int x : nums) {
6            hm.put(x, hm.getOrDefault(x, 0) + 1);
7        }
8        
9        ArrayList<Integer> ll = new ArrayList<>(hm.keySet());
10        Collections.sort(ll);
11
12        for (int i = 0; i < ll.size(); i++) {
13            for (int j = i + 1; j < ll.size(); j++) {
14                int x = ll.get(i);
15                int y = ll.get(j);
16                
17                if (!hm.get(x).equals(hm.get(y))) {
18                    return new int[]{x, y};
19                }
20            }
21        }
22        
23        return new int[]{-1, -1};
24    }
25}