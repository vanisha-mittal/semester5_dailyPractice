// Last updated: 8/20/2026, 4:49:56 PM
1class Solution {
2    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        int group = 0;
5        int count = 0;
6        boolean groupA = true;
7        boolean groupB = true;
8        boolean groupC = true;
9
10        for(int[] seat : reservedSeats){
11            if(!map.containsKey(seat[0])){
12                map.put(seat[0], new ArrayList<>());
13            }
14
15            map.get(seat[0]).add(seat[1]);
16        }
17
18        for(int k : map.keySet()){
19            groupA = true;
20            groupB = true;
21            groupC = true;
22            count++;
23            for(int v : map.get(k)){
24                if(v == 2 || v == 3 || v == 4 || v == 5){
25                    groupA = false;
26                }
27                if(v == 4 || v == 5 || v == 6 || v == 7){
28                    groupB = false;
29                }
30                if(v == 6 || v == 7 || v == 8 || v == 9){
31                    groupC = false;
32                }
33            }
34            if(groupA && groupC){
35                group += 2;
36            } 
37            else if(groupA || groupB || groupC){
38                group++;
39            }
40        }
41
42        group += (n - count) * 2;
43        return group;
44    }
45}