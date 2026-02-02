// Last updated: 2/2/2026, 2:45:39 PM
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
    public ListNode doubleIt(ListNode head) {
        ListNode curr=head;
        if(head.val>4){
            ListNode n=new ListNode(1);
            n.next=head;
            head=n;
            curr=head.next;
        }
        while(curr!=null){
            int carry=0;
            if(curr.next!=null && curr.next.val>4) carry=1;
            curr.val=(curr.val*2+carry)%10;
            curr=curr.next;
        }
        return head;
    }
}