// Last updated: 8/20/2025, 12:47:10 PM
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(new Comparator<>(){
            @Override
            public int compare(ListNode o1, ListNode o2){
                return o1.val-o2.val;
            }
        });
        ListNode Dummy=new ListNode();
        ListNode temp=Dummy;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }
        while(!pq.isEmpty()){
            ListNode val=pq.poll();
            Dummy.next=val;
            Dummy=Dummy.next;
            if(val.next!=null){
                pq.add(val.next);
            }
        }
        return temp.next;

    }
}