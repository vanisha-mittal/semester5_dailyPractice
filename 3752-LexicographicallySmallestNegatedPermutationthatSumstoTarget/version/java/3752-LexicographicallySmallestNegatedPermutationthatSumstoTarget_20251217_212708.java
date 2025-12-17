// Last updated: 12/17/2025, 9:27:08 PM
1class Solution {
2    public int[] lexSmallestNegatedPerm(int n, long target) {
3        long totalSum = (long)n*(n+1)/2;
4        int[] res = new int[n];
5        if((totalSum - target)%2 != 0) return new int[]{};
6        if(-totalSum <= target && target <= totalSum){
7            res = solve(target,totalSum,n);
8        }else{
9            return new int[]{};
10        }
11
12        return res;
13    }
14    public int[] solve(long target, long totalSum, int n){
15        long toBeNegated = (totalSum - target)/2;
16
17        int[] res = new int[n];
18        boolean[]neg =  new boolean[n+1];
19        for(int i = n; i >= 1; i--){
20            if(i <= toBeNegated){
21                neg[i] = true;
22                toBeNegated -= i;
23            }
24        }
25
26        for(int i = 1; i <= n; i++){
27            res[i-1] = neg[i] ? -i : i;
28        }
29
30        Arrays.sort(res);
31
32        return res;
33    }
34}