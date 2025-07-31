// Last updated: 7/31/2025, 5:12:54 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10>=5){
            return 100-(purchaseAmount-purchaseAmount%10+10);
        }
        else{
            return 100-(purchaseAmount-purchaseAmount%10);
        }
        
    }
}