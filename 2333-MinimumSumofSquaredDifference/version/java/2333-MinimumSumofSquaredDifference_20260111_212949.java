// Last updated: 1/11/2026, 9:29:49 PM
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3            int t[]=new int[100001];
4    for(int i=0;i<nums1.length;i++){
5        t[Math.abs(nums1[i]-nums2[i])]++;
6    }
7    int k=k1+k2;
8    for(int i=100000;i>=1 && k>0;i--)
9    {
10        if(t[i]<=0)
11            continue;
12        else if(t[i]<=k)
13        {
14            t[i-1]+=t[i];
15            k-=t[i];
16            t[i]=0;
17        }
18        else
19        {
20            t[i-1]+=k;
21            t[i]-=k;
22            break;
23
24        }
25    }
26    long ans=0;
27    for(long i=1;i<100001;i++)
28    {
29        while(t[(int)i]>0)
30        {
31            ans+=i*i;
32            t[(int)i]--;
33        }
34
35    }
36    return ans;
37    
38    }
39}