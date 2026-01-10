// Last updated: 1/10/2026, 10:03:52 PM
1class Solution {
2    public long maxStrength(int[] nums) {
3        Arrays.sort(nums);
4        long negProd=1,posProd=1,lastNeg=1;
5        int pos=0,neg=0,zero=0;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]==0){
8                zero++;
9                continue;
10            }
11            if(nums[i]<0){
12                negProd*=nums[i];
13                neg++;
14                lastNeg=nums[i];
15            }else{
16                posProd*=nums[i];
17                pos++;
18            }
19        }
20        if(neg==0 && pos==0) return 0;
21        if(neg%2==1){
22            if(neg==1 && pos==0) {
23                return zero > 0 ? 0 : lastNeg;
24            }
25            negProd/=lastNeg;
26        }
27        return negProd*posProd;
28    }
29}