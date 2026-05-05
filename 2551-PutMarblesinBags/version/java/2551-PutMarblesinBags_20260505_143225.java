// Last updated: 5/5/2026, 2:32:25 PM
1class Solution {
2    public long putMarbles(int[] weights, int k) {
3        if(k==1){
4            return 0;
5        }
6        List<Integer> sum=new ArrayList<>();
7        for(int i=0;i<weights.length-1;i++){
8            sum.add(weights[i]+weights[i+1]);
9        }
10        Collections.sort(sum);
11        long min=0;
12        long max=0;
13        for(int i=0;i<k-1;i++){
14            min+=sum.get(i);
15            max+=sum.get(sum.size()-1-i);
16        }
17        return max-min;
18    }
19}