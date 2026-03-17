// Last updated: 3/17/2026, 11:24:28 AM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4        for(int i:nums1){
5            hm.put(i,hm.getOrDefault(i,0)+1);
6        }
7
8        List<Integer> res=new ArrayList<>();
9        for(int i:nums2){
10            if(hm.getOrDefault(i,0)>0){
11                res.add(i);
12                hm.put(i,hm.get(i)-1);
13            }
14        }
15
16        int[] ans=new int[res.size()];
17        for(int i=0;i<res.size();i++){
18            ans[i]=res.get(i);
19        }
20        return ans;
21    }
22}