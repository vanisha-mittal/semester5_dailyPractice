// Last updated: 12/19/2025, 10:41:51 PM
1class Solution {
2    public String longestWord(String[] words) {
3        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
4            if (a.length() == b.length()) {
5                return a.compareTo(b);
6            }
7            return b.length() - a.length();
8        });
9
10        HashSet<String> set = new HashSet<>();
11        for (int i = 0; i < words.length; i++) {
12            set.add(words[i]);
13            pq.offer(words[i]); 
14        }
15
16        while (!pq.isEmpty()) {
17            StringBuilder sb = new StringBuilder(pq.poll());
18
19            String result = sb.toString(); 
20
21
22            while (sb.length() > 0) { 
23                if (!set.contains(sb.deleteCharAt(sb.length() - 1).toString())) {
24                    break;
25                }
26            }
27
28            if (sb.length() == 0) {
29                return result;
30            }
31        }
32
33        return ""; 
34    }
35}