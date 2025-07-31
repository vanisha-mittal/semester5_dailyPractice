// Last updated: 7/31/2025, 5:13:08 PM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        ListNode result = new ListNode(0);
        ListNode res = result;
        if (head.next == null) {
            return head;
        }
        while (temp != null && temp.next != null) {
            int n1 = temp.val;
            int n2 = temp.next.val;

            res.next = new ListNode(n1);
            res = res.next;
            res.next = new ListNode(gcd(n1, n2));
            res = res.next;
            res.next = new ListNode(n2);

            temp = temp.next;
        }
        return result.next;
    }

    public static int gcd(int n1, int n2) {
        int rem;
        while (n2 != 0) {
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n1;
    }

}