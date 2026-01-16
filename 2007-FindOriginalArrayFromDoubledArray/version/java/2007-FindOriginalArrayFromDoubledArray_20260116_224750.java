// Last updated: 1/16/2026, 10:47:50 PM
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        if (changed.length % 2 != 0) {
4            return new int[0];
5        }
6        
7        Arrays.sort(changed);
8        Map<Integer, Integer> map = new HashMap<>();
9        for (int i : changed) {
10            map.put(i, map.getOrDefault(i, 0) + 1);
11        }
12        
13        int[] arr = new int[changed.length / 2];
14        int idx = 0;
15        
16        for (int i : changed) {
17            if (map.get(i) <= 0) {
18                continue;
19            }
20            
21            map.put(i, map.get(i) - 1);
22            int a = i * 2;
23            
24            if (idx == arr.length) {
25                break;
26            }
27            
28            if (map.containsKey(a) && map.get(a) > 0) {
29                arr[idx++] = i;
30                map.put(a, map.get(a) - 1);     
31            } else {
32                return new int[0];
33            }
34        }
35        
36        return arr;
37    }
38}