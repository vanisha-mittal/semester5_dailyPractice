// Last updated: 1/6/2026, 12:28:59 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<String> ll= new ArrayList<>();
4        List<List<String>> ans= new ArrayList<>();
5        Partition(s,ll,ans);
6        return ans;
7    }
8    public static void Partition(String ques, List<String> ll,List<List<String>> ans){
9		if(ques.length()==0) {
10            ans.add(new ArrayList<>(ll));
11			return;
12		}
13		for(int cut=1;cut<=ques.length();cut++) {
14			String s=ques.substring(0,cut);
15			if(isPallindrome(s)) {
16                ll.add(s);
17				Partition(ques.substring(cut),ll,ans);
18                ll.remove(ll.size()-1);
19			}
20		}
21	}
22	public static boolean isPallindrome(String s) {
23		int i=0;
24		int j=s.length()-1;
25		while(i<=j) {
26			if(s.charAt(i)!=s.charAt(j)) {
27				return false;
28			}
29			i++;
30			j--;
31		}
32		return true;
33	}
34}