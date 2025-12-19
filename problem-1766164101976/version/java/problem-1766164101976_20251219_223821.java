// Last updated: 12/19/2025, 10:38:21 PM
1class Solution {
2    public boolean isPossible(int[] nums) {
3        Map<Integer, PriorityQueue<Integer>>lastElements = new HashMap<>();
4        for (int element: nums){
5            int subseqCount = 0;
6            if (lastElements.containsKey(element-1)){
7                subseqCount = lastElements.get(element-1).poll();
8                if (lastElements.get(element-1).isEmpty()) lastElements.remove(element-1);
9            }
10            lastElements.putIfAbsent(element, new PriorityQueue<>());
11            lastElements.get(element).add(subseqCount+1);
12        }
13        for (Map.Entry<Integer,PriorityQueue<Integer>>entry: lastElements.entrySet()){
14            while (!entry.getValue().isEmpty()){
15                if (entry.getValue().poll()<3)return false;
16            }
17        }
18        return true;
19    }
20}