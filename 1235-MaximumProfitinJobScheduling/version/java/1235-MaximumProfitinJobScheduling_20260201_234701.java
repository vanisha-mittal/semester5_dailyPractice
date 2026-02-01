// Last updated: 2/1/2026, 11:47:01 PM
1class Solution {
2    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
3        int n = startTime.length;
4        int[][] cal = new int[n][3];
5
6        for (int i = 0; i < n; i++) {
7            cal[i][0] = startTime[i];
8            cal[i][1] = endTime[i];
9            cal[i][2] = profit[i];
10        }
11
12        Arrays.sort(cal, Comparator.comparingInt(a -> a[1]));
13
14        TreeMap<Integer, Integer> dp = new TreeMap<>();
15        dp.put(0, 0);
16        
17        for(int[] job: cal){
18            int start = job[0];
19            int end = job[1];
20            int currJobProfit = job[2];
21
22            Integer prevJob = dp.floorKey(start);
23            
24            int maxProfit = dp.get(prevJob) + currJobProfit;
25            int maxProfitSoFar = dp.lastEntry().getValue();
26
27            if(maxProfit > maxProfitSoFar)
28                dp.put(end, maxProfit);
29        }
30
31        return dp.lastEntry().getValue();
32    }
33}