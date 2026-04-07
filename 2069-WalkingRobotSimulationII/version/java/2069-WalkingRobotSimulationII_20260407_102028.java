// Last updated: 4/7/2026, 10:20:28 AM
1class Robot {
2
3    int w, h;
4    int x, y;
5    int dir; // 0=East, 1=North, 2=West, 3=South
6    int per;
7
8    public Robot(int width, int height) {
9        this.w = width;
10        this.h = height;
11        this.x = 0;
12        this.y = 0;
13        this.dir = 0; // initially East
14        this.per = 2 * (w + h) - 4;
15    }
16    
17    public void step(int num) {
18        if (per == 0) return;
19
20        num %= per;
21
22        // special case: full cycle
23        if (num == 0) {
24            if (x == 0 && y == 0) {
25                dir = 3; // South
26            }
27            return;
28        }
29
30        while (num > 0) {
31            if (dir == 0) { // East
32                int move = Math.min(num, w - 1 - x);
33                x += move;
34                num -= move;
35                if (num > 0) dir = 1;
36            } 
37            else if (dir == 1) { // North
38                int move = Math.min(num, h - 1 - y);
39                y += move;
40                num -= move;
41                if (num > 0) dir = 2;
42            } 
43            else if (dir == 2) { // West
44                int move = Math.min(num, x);
45                x -= move;
46                num -= move;
47                if (num > 0) dir = 3;
48            } 
49            else { // South
50                int move = Math.min(num, y);
51                y -= move;
52                num -= move;
53                if (num > 0) dir = 0;
54            }
55        }
56    }
57    
58    public int[] getPos() {
59        return new int[]{x, y};
60    }
61    
62    public String getDir() {
63        if (dir == 0) return "East";
64        if (dir == 1) return "North";
65        if (dir == 2) return "West";
66        return "South";
67    }
68}
69
70/**
71 * Your Robot object will be instantiated and called as such:
72 * Robot obj = new Robot(width, height);
73 * obj.step(num);
74 * int[] param_2 = obj.getPos();
75 * String param_3 = obj.getDir();
76 */