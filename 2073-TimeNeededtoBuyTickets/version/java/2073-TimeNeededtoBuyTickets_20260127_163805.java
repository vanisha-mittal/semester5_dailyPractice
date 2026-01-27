// Last updated: 1/27/2026, 4:38:05 PM
1class Solution {
2     public int findTheWinner(int n, int k) {
3        Queue<Integer> q = new LinkedList<>();
4        for(int i=1; i<=n; i++){
5            q.add(i);
6        }
7
8        while(q.size() != 1){
9            int x = 1;
10            while(x <= k-1){
11                q.add(q.remove());
12                x++;
13            }
14            q.remove();
15        }
16        return q.peek();
17     }
18 }