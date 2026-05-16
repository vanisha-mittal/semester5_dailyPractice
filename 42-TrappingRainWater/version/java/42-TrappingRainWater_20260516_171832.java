// Last updated: 5/16/2026, 5:18:32 PM
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int[] l=new int[n];
5        int[] r=new int[n];
6        l[0]=height[0];
7        r[n-1]=height[n-1];
8        for(int i=1;i<n;i++){
9            l[i]=Math.max(l[i-1],height[i]);
10        }
11        for(int i=n-2;i>=0;i--){
12            r[i]=Math.max(r[i+1],height[i]);
13        }
14        int sum=0;
15        for(int i=0;i<n;i++){
16            sum+=Math.min(l[i],r[i])-height[i];
17        }
18        return sum;
19    }
20}