// Last updated: 9/24/2025, 11:20:38 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq=new int[1001];
        int x=0;
        for(int i=0 ; i<nums1.length ; i++){
            freq[nums1[i]]++;
        }
        for(int i=0 ; i<nums2.length ; i++){
            if(freq[nums2[i]]>0){
                freq[nums2[i]]++;
                nums2[x++]=nums2[i];
                freq[nums2[i]]=0;
            }
            
        }
        int[] result=new int[x];
        for(int i=0 ; i<x;i++){
            result[i]=nums2[i];
        }
        return result;
    }
}