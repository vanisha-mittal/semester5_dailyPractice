// Last updated: 8/2/2025, 4:04:00 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m-1;
        int b=n-1;
        while(a>=0 && b>=0){
            if(nums1[a]>=nums2[b]){
                nums1[a+b+1]=nums1[a];
                a--;
            }
            else{
                nums1[a+b+1]=nums2[b];
                b--;
            }
        }
        while(b>=0){
            nums1[b]=nums2[b];
            b--;
        }
    }
}
