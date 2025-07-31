// Last updated: 7/31/2025, 5:11:01 PM
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int count=0;
        for (int i=0;i<n;i++){
            int a=colors[i];
            int b=colors[(i+1)%n];
            int c=colors[(i+2)%n];
            if (a!=b && b!=c){
                count++;
            }
        }  
        return count;
        
    }
}