// Last updated: 2/24/2026, 11:34:33 AM
1class Solution {
2     private HashMap<Integer, List<Integer>> map;
3    public int[] findOrder(int numCourses, int[][] prerequisites) {
4        map=new HashMap<>();
5		for(int i=0;i<numCourses;i++) {
6			map.put(i, new ArrayList<>());
7		}
8
9       for(int i=0;i<prerequisites.length;i++){
10             AddEdge(prerequisites[i][0],prerequisites[i][1]);
11       }
12        return isCycle(numCourses);
13    }
14  
15	
16	public void AddEdge(int v1,int v2) {
17		map.get(v1).add(v2);
18	}
19	
20	public int[] indegree(){
21		int[] in=new int[map.size()];
22		for(int v1:map.keySet()) {
23			for(int v2:map.get(v1)) {
24				in[v2]++;
25			}
26		}
27		return in;
28	}
29	 public int[] isCycle(int numCourses) {
30		 int[] arr=new int[numCourses];
31         int idx=numCourses-1;
32		 Queue<Integer> q=new LinkedList<>();
33		 int[] in=indegree();
34		 for(int i=0;i<in.length;i++) {
35			 if(in[i]==0) {
36				 q.add(i);
37			 }
38		 }
39		 int c=0;
40		 while(!q.isEmpty()) {
41			 int r= q.poll();
42             arr[idx--]=r;
43             
44			c++;
45			 for(int nbrs: map.get(r)) {
46				 in[nbrs]--;
47				 if(in[nbrs]==0) {
48					 q.add(nbrs);
49				 }
50			 }
51		 }
52		if(c!=map.size()){ //cycle is their so no order we can return
53            return new int[0];
54        }
55        
56        return arr;
57     }
58}