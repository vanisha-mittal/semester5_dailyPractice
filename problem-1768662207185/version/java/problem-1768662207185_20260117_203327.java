// Last updated: 1/17/2026, 8:33:27 PM
1class Solution {
2    Map<Integer, List<int[]>> mp = new HashMap<>();
3    List<Integer> result = new ArrayList<>();
4    int[] arr;
5    public List<Integer> minimumFlips(int n, int[][] edges, String start, String target) {
6        for (int i = 0; i < n; i++) {
7            mp.put(i, new ArrayList<>());
8        }
9
10        for (int i = 0; i < edges.length; i++) {
11            int u = edges[i][0], v = edges[i][1];
12            mp.get(u).add(new int[]{v, i});
13            mp.get(v).add(new int[]{u, i});
14        }
15
16        arr = new int[n];
17        for (int i = 0; i < n; i++) {
18            arr[i] = (start.charAt(i) - '0') ^ (target.charAt(i) - '0');
19        }
20
21        int p = DFS(0, -1);
22
23        if (p != 0) {
24            List<Integer> ans = new ArrayList<>();
25            ans.add(-1);
26            return ans;       
27        }
28
29        Collections.sort(result);
30        
31        return result;
32    }
33
34    private int DFS(int u, int parent) {
35        int parity = arr[u];
36
37        for (int[] e : mp.get(u)) {
38            int v = e[0];
39            int idx = e[1];
40
41            if (v == parent) continue;
42
43            int child = DFS(v, u);
44
45            if (child == 1) {
46                result.add(idx);
47                parity ^= 1;
48            }
49        }
50        return parity;
51    }
52}