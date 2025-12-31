// Last updated: 12/31/2025, 11:16:01 PM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        List<List<Integer>> arr=new ArrayList<>();
4        for(int i=0;i<n;i++)
5        {
6            arr.add(new ArrayList<>());
7        }
8        for(int i=0;i<edges.length;i++)
9        {
10            int u=edges[i][0];
11            int v=edges[i][1];
12            arr.get(u).add(v);
13            arr.get(v).add(u);
14        }
15        boolean b[]=new boolean[n];
16        Arrays.fill(b,false);
17        Queue<Integer>q =new LinkedList<>();
18        q.add(source);
19        b[source]=true;
20        while(q.size()!=0){
21            if(q.peek()==destination) return true;
22            for(int i:arr.get(q.peek())){
23                if(!b[i]){
24                    q.add(i);
25                    b[i]=true;
26                }
27            }
28            q.remove();
29        }
30        return b[destination];
31    }
32}