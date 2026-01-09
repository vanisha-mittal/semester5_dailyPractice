// Last updated: 1/9/2026, 9:50:13 PM
1class Solution {
2    public boolean[] subsequenceSumAfterCapping(int[] nums, int K) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        HashSet<Integer> sums=new HashSet<Integer>();
6        boolean[] ans=new boolean[n];
7        sums.add(0);
8        int j=0;
9        for(int i=1;i<=n;i++){
10            while(j<n&&nums[j]<=i){
11                ArrayList<Integer> temp=new ArrayList<Integer>(sums);
12                {
13                for(int k:temp)
14                    if(k+nums[j]<=K)
15                        sums.add(k+nums[j]);
16            j++;
17            }}
18            if(sums.contains(K))
19                ans[i-1]=true;
20            else{
21                for(int k=j;k<n;k++)
22                    if(sums.contains(K-(k-j+1)*i)){
23                        ans[i-1]=true;
24                        break;}
25            }
26        }
27        return ans;
28    }
29}