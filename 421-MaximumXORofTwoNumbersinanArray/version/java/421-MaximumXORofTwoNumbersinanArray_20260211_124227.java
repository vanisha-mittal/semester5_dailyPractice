// Last updated: 2/11/2026, 12:42:27 PM
1class Solution {
2    public int findMaximumXOR(int[] arr) {
3		Trie t=new Trie();
4		for(int x:arr) {
5			t.add(x);
6		}
7		int ans=0;
8		for(int x:arr) {
9			ans=Math.max(t.getMaxXor(x), ans);
10		}
11		// System.out.println(ans);
12        return ans;
13	}
14	static class Trie{
15		class Node{
16			Node zero;
17			Node one;
18		}
19		private Node root=new Node();
20		public void add(int val) {
21			Node curr=root;
22			for(int i=31;i>=0;i--) {
23				int bit = val&(1<<i);
24				if(bit==0) {
25					if(curr.zero!=null) {
26						curr=curr.zero;
27					}
28					else {
29						Node nn=new Node();
30						curr.zero=nn;
31						curr=nn;
32					}
33				}
34				else {
35					if(curr.one!=null) {
36						curr=curr.one;
37					}
38					else {
39						Node nn=new Node();
40						curr.one=nn;
41						curr=nn;
42					}
43				}
44			}
45		}
46		public int getMaxXor(int x) {
47			int ans=0;
48			Node curr=root;
49			for(int i=31;i>=0;i--) {
50				int bit=x&(1<<i);
51				if(bit==0) {
52					if(curr.one!=null) {
53						ans=ans|(1<<i);
54						curr=curr.one;
55					}
56					else {
57						curr=curr.zero;
58					}
59				}
60				else {
61					if(curr.zero!=null) {
62						ans=ans|(1<<i);
63						curr=curr.zero;
64					}
65					else {
66						curr=curr.one;
67					}
68				}
69			}
70			return ans;
71		}
72	}
73}