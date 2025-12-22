// Last updated: 12/22/2025, 7:59:31 PM
1class Solution {
2    public String arrangeWords(String text) {
3		String[] sentences = text.split(" ");
4		HashMap<Integer,String> hash = new HashMap<Integer,String>();
5		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
6		for(String s : sentences) 
7		{
8			if(!hash.containsKey(s.length())) 
9			{
10				hash.put(s.length(),s+" ");
11				q.add(s.length());
12			}
13			else
14			{
15				hash.put(s.length(), hash.get(s.length())+s+" ");
16			}
17		}
18		
19		String sentence = "";
20		Integer length = q.poll();
21		char c = hash.get(length).charAt(0);
22		String s = hash.get(length).replaceFirst(c+"", Character.toUpperCase(c)+"");
23		sentence = s.trim()+" ";
24		while(!q.isEmpty()) 
25		{
26			length = q.poll();
27			sentence += hash.get(length).trim().toLowerCase() + " ";
28		}
29		
30		return sentence.trim();
31	}
32}