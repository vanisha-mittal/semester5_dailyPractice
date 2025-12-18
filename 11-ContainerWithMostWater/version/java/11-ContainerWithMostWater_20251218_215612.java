// Last updated: 12/18/2025, 9:56:12 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int r=height.length-1;
5        int ans=0;
6        while(l<r){
7            int width=r-l;
8            int ht=Math.min(height[l],height[r]);
9            int contain=width*ht;
10            ans=Math.max(ans,contain);
11            if(height[l]<height[r]){
12                l++;
13            }
14            else{
15                r--;
16            }
17        }
18        return ans;
19    }
20}