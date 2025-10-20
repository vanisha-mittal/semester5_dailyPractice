// Last updated: 10/20/2025, 4:59:52 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;  // start with X = 0
        
        for (String op : operations) {
            if (op.contains("+")) {
                X++;   
            } else {
                X--;  
            }
        }
        
        return X;
    }
}
