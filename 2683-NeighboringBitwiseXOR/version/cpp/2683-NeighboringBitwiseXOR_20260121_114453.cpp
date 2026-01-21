// Last updated: 1/21/2026, 11:44:53 AM
1class Solution {
2public:
3    int xorAllNums(vector<int>& nums1, vector<int>& nums2) {
4        int ans=0;
5        if(nums1.size()%2==1){
6            for(int i:nums2) ans^=i; 
7        }
8        if(nums2.size()%2==1){
9            for(int i:nums1) ans^=i;
10        }
11        return ans;
12    }
13};