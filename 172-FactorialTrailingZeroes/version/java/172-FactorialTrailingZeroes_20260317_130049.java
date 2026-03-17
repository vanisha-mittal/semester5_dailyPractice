// Last updated: 3/17/2026, 1:00:49 PM
1class Solution {
2    static List<List<Integer>> ll;
3    static int[] sum;
4    static int[] nodes;
5    static int n;
6    static void dfs(int nn, int parent){
7        for(int nbr:ll.get(nn)){
8            if(nbr!=parent){
9                dfs(nbr,nn);
10                nodes[nn]+=nodes[nbr];
11                sum[nn]+=sum[nbr]+nodes[nbr];
12            }
13        }
14    }
15
16    static void dfs2(int nn, int parent){
17        if(parent!=-1){
18            int rem=n-nodes[nn];
19            sum[nn]+=sum[parent]-(sum[nn]+nodes[nn])+rem;
20        }
21
22        for(int nbr:ll.get(nn)){
23            if(parent!=nbr){
24                dfs2(nbr,nn);
25            }
26        }
27    }
28    public int[] sumOfDistancesInTree(int n, int[][] edges) {
29        this.n=n;
30        ll=new ArrayList<>();
31        for(int i=0;i<n;i++){
32            ll.add(new ArrayList<>());
33        }
34
35        for(int[] i:edges){
36            ll.get(i[0]).add(i[1]);
37            ll.get(i[1]).add(i[0]);
38        }
39        sum=new int[n];
40        nodes=new int[n];
41        Arrays.fill(nodes,1);
42
43        dfs(0,-1);
44        dfs2(0,-1);
45        return sum;
46    }
47}