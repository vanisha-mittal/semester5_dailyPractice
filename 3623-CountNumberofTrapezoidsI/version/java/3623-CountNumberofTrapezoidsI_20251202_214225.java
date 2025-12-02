// Last updated: 12/2/2025, 9:42:25 PM
1class Solution {
2    public int countTrapezoids(int[][] points) {
3        long mod=1000000007L;
4        Map<Integer,Long> mapy=new HashMap<>();
5        for(int []row:points){
6            mapy.put(row[1],mapy.getOrDefault(row[1],0L)+1);
7        }
8        List<Long> height=new ArrayList<>();
9        for(long val:mapy.values()){
10            if(val>=2){
11                long ways=(val*(val-1))/2;
12                height.add(ways%mod);
13            }
14        }
15        long ans=0,sum=0;
16        for(long val:height){
17            ans=(ans+(val*sum)%mod)%mod;
18            sum=(sum+val)%mod;
19        }
20        return (int)ans;
21    }
22}