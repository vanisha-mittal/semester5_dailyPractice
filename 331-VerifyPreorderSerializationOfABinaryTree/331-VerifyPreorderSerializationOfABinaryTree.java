// Last updated: 7/31/2025, 5:21:21 PM
class Solution {
    public boolean isValidSerialization(String preorder) {
        int Null=1;
        String[] s=preorder.split(",");
        for(String i:s){
            if(Null==0){
                return false;
            }
            if(i.equals("#")){
                Null--;
            }
            else{
                Null++;
            }
        }
        if(Null==0){
            return true;
        }
        return false;
    }
}