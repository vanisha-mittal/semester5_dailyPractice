// Last updated: 7/31/2025, 5:14:25 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k<=numOnes){
            return k;
        }
        else if(k<=numOnes+numZeros){
            return numOnes;
        }
        return numOnes-(k-numOnes-numZeros);
        
    }
}