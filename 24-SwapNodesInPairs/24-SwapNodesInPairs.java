// Last updated: 8/2/2025, 4:05:18 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode d = new ListNode(-1);
        d.next = head;
        head = d;
        ListNode t = head.next;
        ListNode n = t.next;
        while(true) {
            t.next = n.next;
            n.next = t;
            d.next = n;
            d = t;
            if(t.next == null || t.next.next == null) {
                break;
            } else {
                t = t.next;
                n = t.next;
            }
        }
        return head.next;
    }
}