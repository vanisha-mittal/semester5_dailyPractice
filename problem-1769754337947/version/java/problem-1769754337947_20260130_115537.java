// Last updated: 1/30/2026, 11:55:37 AM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int[] ans=new int[deck.length];
5        Queue<Integer> q=new LinkedList<>();
6        for(int i=0;i<deck.length;i++){
7            q.add(i);
8        }
9        int j=0;
10        while(q.size()>=2){
11            ans[q.poll()]=deck[j++];
12            int i=q.poll();
13            q.add(i);
14        }
15        ans[q.poll()]=deck[j];
16        return ans;
17    }
18}