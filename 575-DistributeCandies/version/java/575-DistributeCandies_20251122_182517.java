// Last updated: 11/22/2025, 6:25:17 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:candyType){
            hs.add(i);
        }
        int i=hs.size();
        int n=candyType.length;
        if(i>=n/2) return n/2;
        return i;
    }
}