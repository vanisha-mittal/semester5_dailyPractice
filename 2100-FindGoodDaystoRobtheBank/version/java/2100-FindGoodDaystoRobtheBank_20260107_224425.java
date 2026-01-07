// Last updated: 1/7/2026, 10:44:25 PM
1class Solution {
2    public List<Integer> goodDaysToRobBank(int[] security, int time) {
3        int n = security.length;
4        int []left = new int[n];
5        int []right = new int[n];
6        
7        for(int i = 1;i<n;i++){
8            left[i] = security[i] <= security[i-1] ? left[i-1] + 1 : 0;
9        }
10        for(int i = n-2;i>=0;i--){
11            right[i] = security[i] <= security[i+1] ? right[i+1] + 1 : 0;
12        }
13        
14        List<Integer> res = new ArrayList<>();
15        for(int i = time;i<security.length-time;i++){
16            if(left[i] >= time && right[i] >= time){
17                res.add(i);
18            }
19        }
20        
21        return res;
22    }
23}