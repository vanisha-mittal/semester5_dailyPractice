// Last updated: 2/7/2026, 10:46:59 PM
1class Solution {
2    public int numTeams(int[] rating) {
3        int c=0;
4        for(int i=0;i<rating.length;i++){
5            for(int j=i+1;j<rating.length;j++){
6                for(int k=j+1;k<rating.length;k++){
7                    if((rating[i]<rating[j] && rating[j]<rating[k])||(rating[i]>rating[j] && rating[j]>rating[k])) c++;
8                }
9            }
10        }
11        return c;
12    }
13}