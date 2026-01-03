// Last updated: 1/3/2026, 11:26:14 AM
1class Solution {
2    HashMap<String, List<String>> map;
3
4    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
5
6        map = new HashMap<>();
7
8        for (String w : wordList) {
9            map.put(w, new ArrayList<>());
10        }
11
12        for (int i = 0; i < wordList.size(); i++) {
13            for (int j = i + 1; j < wordList.size(); j++) {
14                if (isConnected(wordList.get(i), wordList.get(j))) {
15                    map.get(wordList.get(i)).add(wordList.get(j));
16                    map.get(wordList.get(j)).add(wordList.get(i));
17                }
18            }
19        }
20
21        // add beginWord
22        if (!map.containsKey(beginWord)) {
23            map.put(beginWord, new ArrayList<>());
24            for (String w : wordList) {
25                if (isConnected(beginWord, w)) {
26                    map.get(beginWord).add(w);
27                    map.get(w).add(beginWord);
28                }
29            }
30        }
31
32        return bfs(beginWord, endWord);
33    }
34
35    public int bfs(String src, String des) {
36        Queue<String> q = new LinkedList<>();
37        HashSet<String> visited = new HashSet<>();
38
39        q.add(src);
40        int c = 1;
41
42        while (!q.isEmpty()) {
43            int size = q.size();
44
45            for (int i = 0; i < size; i++) {
46                String r = q.poll();
47
48                if (visited.contains(r)) continue;
49                visited.add(r);
50
51                if (r.equals(des)) return c;
52
53                for (String nbr : map.get(r)) {
54                    if (!visited.contains(nbr)) {
55                        q.add(nbr);
56                    }
57                }
58            }
59            c++;
60        }
61        return 0;
62    }
63
64    private boolean isConnected(String a, String b) {
65        int diff = 0;
66        for (int i = 0; i < a.length(); i++) {
67            if (a.charAt(i) != b.charAt(i)) diff++;
68            if (diff > 1) return false;
69        }
70        return diff == 1;
71    }
72}