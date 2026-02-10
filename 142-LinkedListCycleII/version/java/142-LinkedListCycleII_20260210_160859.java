// Last updated: 2/10/2026, 4:08:59 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head, fast = head;
15        while (fast != null && fast.next != null) {
16            slow = slow.next;
17            fast = fast.next.next;
18            if (slow == fast) break;
19        }
20        if (fast == null || fast.next == null) return null;
21        while (head != slow) {
22            head = head.next;
23            slow = slow.next;
24        }
25        return head;
26    }
27}