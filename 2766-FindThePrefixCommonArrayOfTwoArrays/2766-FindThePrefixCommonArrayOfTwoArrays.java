// Last updated: 8/1/2025, 2:26:54 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] freq=new int [n+1];
        int c=0;
        for(int i=0;i<n;i++){
            if(++freq[A[i]]==2){
                c++;
            }
            if(++freq[B[i]]==2){
                c++;
            }
            A[i]=c;
        }
        return A;
    }
}