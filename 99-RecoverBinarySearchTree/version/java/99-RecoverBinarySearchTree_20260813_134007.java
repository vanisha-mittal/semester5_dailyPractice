// Last updated: 8/13/2026, 1:40:07 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> s=new HashSet<>();
4        for(int i:nums){
5            s.add(i);
6        }
7        int ans=0;
8        for(int num:s){
9        // for(int i=0;i<nums.length;i++){
10            if(!s.contains(num-1)){
11                int c=0;
12                int key=num;
13                while(s.contains(key)){
14                    c++;
15                    key++;
16                }
17                ans=Math.max(ans,c);
18            }
19            
20        }
21        return ans;
22    }
23}