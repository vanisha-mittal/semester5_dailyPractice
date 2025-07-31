// Last updated: 7/31/2025, 5:21:11 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        return Root(num); 
    }
    public static boolean Root(int n) {
		int l=1;
		int h=n;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(Math.pow(mid, 2)==n) {
				return true;
			}
            else if(Math.pow(mid, 2)<n){
                l=mid+1;
            }
			else {
				h=mid-1;
			}
		}
		return false;
	}
}