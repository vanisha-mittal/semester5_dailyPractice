// Last updated: 12/31/2025, 11:17:10 PM
1class Solution {
2    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
3        double[] probs = new double[n];
4        probs[start_node] = 1;
5        for(int i = 0; i < n - 1; i++) {
6            boolean change = false;
7            for(int j = 0; j < edges.length; j++) {
8                int src = edges[j][0];
9                int dest = edges[j][1];
10                double prob = succProb[j];
11
12                if(probs[src] * prob > probs[dest]) {
13                    probs[dest] = probs[src] * prob;
14                    change = true;
15                }
16                if(probs[dest] * prob > probs[src]) {
17                    probs[src] = probs[dest] * prob;
18                    change = true;
19                }
20            }
21            if(change == false) break;
22        }
23        return probs[end_node];
24    }
25}