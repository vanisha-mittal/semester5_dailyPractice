// Last updated: 12/26/2025, 5:43:09 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5
6        int i = 0, j = 0;
7
8        while( i < n && j < m ) {
9            if( nums1[i] == nums2[j] ) {
10                return nums1[i];
11            }
12            else if( nums1[i] < nums2[j] ) {
13                while( i < n && nums1[i] < nums2[j] ) {
14                    i += 1;
15                }
16            }
17            else{
18                while( j < m && nums2[j] < nums1[i] ) {
19                    j += 1;
20                }
21            }
22        }
23
24        return -1;
25
26    }
27}