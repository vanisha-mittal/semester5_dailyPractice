// Last updated: 1/19/2026, 3:55:33 PM
1class MinStack {
2    private Stack<Integer> m;
3    private Stack<Integer> mini;
4    // static int mini;
5    public MinStack() {
6       m=new Stack<>();
7      mini=new Stack<>();
8    }
9    
10    public void push(int val) {
11        m.push(val);
12        if(mini.isEmpty()|| mini.peek()>=val){
13            mini.push(val);
14        }
15    }
16    
17    public void pop() {
18       int n= m.pop();
19        if(n==mini.peek()){
20            mini.pop();
21        }
22    }
23    
24    public int top() {
25        return m.peek();
26    }
27    
28    public int getMin() {
29        if(!mini.isEmpty()) 
30        return mini.peek();
31        return 0;
32    }
33}
34
35/**
36 * Your MinStack object will be instantiated and called as such:
37 * MinStack obj = new MinStack();
38 * obj.push(val);
39 * obj.pop();
40 * int param_3 = obj.top();
41 * int param_4 = obj.getMin();
42 */