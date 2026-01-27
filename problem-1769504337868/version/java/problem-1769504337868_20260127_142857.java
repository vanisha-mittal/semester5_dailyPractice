// Last updated: 1/27/2026, 2:28:57 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int i=0;
4        int ans=0;
5        while(tickets[k]>0){
6            if(i==tickets.length){
7                i=0;
8            }
9            if(tickets[i]>0){
10                tickets[i]--;
11                ans++;
12            }
13            i++;
14        }
15        return ans;
16        
17    }
18}