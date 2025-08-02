// Last updated: 8/2/2025, 4:05:29 PM
class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> ll=new ArrayList<>();
        letter(digits,"", ll);
        return ll;
    }
    public static void letter(String ques,String ans,List<String> ll) {
		if(ques.length()==0) {
			// System.out.println(ans);
            if(ans!=""){
                ll.add(ans);
            }
            
			return;
		}
		char ch=ques.charAt(0);
		String getString=key[ch-'0'];
		for(int i=0;i<getString.length();i++) {
			letter(ques.substring(1),ans+getString.charAt(i),ll);
		}
	}

}