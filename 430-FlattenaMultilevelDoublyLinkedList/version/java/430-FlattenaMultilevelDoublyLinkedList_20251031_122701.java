// Last updated: 10/31/2025, 12:27:01 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp=head;
        Stack<Node> st=new Stack<>();
        while(temp!=null){
            if(temp.child!=null){
                if(temp.next!=null) st.push(temp.next);

                temp.next=temp.child;
                temp.child=null;
                temp.next.prev=temp;
                temp=temp.next;
                continue;
            }
            if(!st.isEmpty() && temp.next==null){
                temp.next=st.pop();
                temp.next.prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
}