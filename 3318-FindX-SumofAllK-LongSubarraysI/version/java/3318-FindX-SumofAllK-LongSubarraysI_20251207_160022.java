// Last updated: 12/7/2025, 4:00:22 PM
1class Solution{
2    public int[] findXSum(int[] nums,int k,int x){
3        int n=nums.length;
4        int[] ans=new int[n-k+1];
5        for(int i=0;i<=n-k;i++){
6            int[] f=new int[51];
7            for(int j=i;j<i+k;j++){
8                f[nums[j]]++;
9            }
10            int[][] a=new int[51][2];
11            int m=0;
12            for(int l=1;l<=50;l++){
13                if(f[l]>0){
14                    a[m++]=new int[]{l,f[l]};
15                }
16            }
17            Arrays.sort(a,0,m,(p,q)->p[1] == q[1]?q[0]-p[0]:q[1]-p[1]);
18            int s=0,c=0;
19            for(int t=0; t<m && c<x ;t++){
20                s+=a[t][0]*a[t][1];
21                c++;
22            }
23            ans[i]=s;
24        }
25        return ans;
26    }
27}