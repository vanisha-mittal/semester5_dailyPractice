// Last updated: 8/2/2025, 4:03:00 PM
class MinStack {
    Stack<Integer> st;
    PriorityQueue<Integer> pq; 
    public MinStack() {
        st=new Stack<>();
        pq=new PriorityQueue<>();
    }
    
    public void push(int val) {
        st.push(val);
        pq.add(val);
    }
    
    public void pop() {
        int a=st.pop();
        pq.remove(a);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */