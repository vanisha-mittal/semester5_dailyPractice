// Last updated: 2/2/2026, 2:28:43 PM
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
12    public ListNode doubleIt(ListNode head) {
13        ListNode curr = head;
14        ListNode prev = null;
15        while (curr != null) {
16            ListNode ahead = curr.next;
17            curr.next = prev;
18            prev = curr;
19            curr = ahead;
20        }
21		curr=prev;
22        head=null;
23        int carry=0;
24        while (curr != null) {
25            ListNode ahead = curr.next;
26            int value = curr.val * 2 + carry;
27            curr.val = value % 10;
28            carry = value / 10;
29            curr.next = head;
30            head = curr;
31            curr = ahead;
32        }
33
34        if (carry > 0) {
35            head = new ListNode(carry, head);
36        }
37
38        return head;
39    }
40}