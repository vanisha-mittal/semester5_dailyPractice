// Last updated: 7/31/2025, 5:20:29 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return Binary(letters,target);
    }
    public static char Binary(char [] arr, char item) {
		int l=0;
		int h=arr.length-1;
        char ans=arr[0];
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]>item) {
                ans=arr[mid];
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return ans;
	}

}