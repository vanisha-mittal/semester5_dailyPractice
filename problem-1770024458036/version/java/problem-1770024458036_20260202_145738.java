// Last updated: 2/2/2026, 2:57:38 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nextLargerNodes(ListNode head) {
13        ArrayList<Integer> arr=new ArrayList<>();
14        ListNode temp=head;
15        int n = 0;
16		ListNode node = head;
17		while(node != null) {
18				    node = node.next;
19				    n++;
20		 }
21        int[] ans=new int[n];
22		Stack<int[]> st=new Stack<>();
23        int i=0;
24		while(temp!=null){
25			while(!st.isEmpty() && temp.val>st.peek()[0]) {
26                int[] v=st.pop();
27				ans[v[1]]=temp.val;
28			}
29			st.push(new int[]{temp.val,i});
30            i++;
31            temp=temp.next;
32		}
33		while(!st.isEmpty()) {
34			ans[st.pop()[1]]=0;
35		}
36		return ans;
37    }
38}