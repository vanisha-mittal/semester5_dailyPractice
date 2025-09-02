// Last updated: 9/2/2025, 11:03:38 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] f=new int[10];
        while(n>0){
            int digit=n%10;
            f[digit]++;
            n/=10;
        }
        int ans=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(f[i]>0 && f[i]<min){
                min=f[i];
                ans=i;
            }
        }
        return ans;
    }
}