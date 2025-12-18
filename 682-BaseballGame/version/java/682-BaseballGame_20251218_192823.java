// Last updated: 12/18/2025, 7:28:23 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        ArrayDeque<Integer> st = new ArrayDeque<>();
4        int total=0;
5        for (String op : operations)
6        {
7            switch(op){
8                case "C":
9                    st.pop();
10                    break;
11                case "D":
12                    st.push(st.peek()*2);
13                    break;
14                case "+":
15                    int last_element = st.pop();
16                    int sum = last_element + st.peek();
17                    st.push(last_element);
18                    st.push(sum);
19                    break;
20                default :
21                    st.push(Integer.parseInt(op));
22                    break;
23            }
24        }
25        for(int sc : st)
26        {
27            total = total+sc;
28        }
29        return total;
30    }
31}