// Last updated: 7/31/2025, 5:20:38 PM
class Solution {
    public int countSubstrings(String s) {
        return count_palindromic(s);
    }
    public static int count_palindromic(String s) {
		//odd
		int odd=0;
		for(int axis=0;axis<s.length();axis++) {
			for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) {
					break;
				}
				odd++;
			}
		}
		//even 
		int even=0;
		for(double axis=0.5;axis<s.length();axis++) {
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))) {
					break;
				}
				even++;
			}
		}
		return odd+even;
	}

}