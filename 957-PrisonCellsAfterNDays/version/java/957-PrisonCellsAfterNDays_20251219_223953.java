// Last updated: 12/19/2025, 10:39:53 PM
1class Solution {
2    public int[] prisonAfterNDays(int[] cells, int N) {
3        
4        Map<String,Integer> map = new HashMap<>();
5        String cellsStr = Arrays.toString(cells);
6        
7        for(int i=0; i<N; i++) {
8            
9            map.put(cellsStr, i); // keep track of the state and day
10            
11            cells = nextDay(cells); // advance the state
12            cellsStr = Arrays.toString(cells); // serialize it
13            
14            // if we've seen this state before, fast-forward
15            if(map.containsKey(cellsStr)) { 
16                int daysAgo = i + 1 - map.get(cellsStr); // how many days ago was it when we saw this state?
17                int daysLeft = N - (i + 1); // how many days do we have left (if we don't fast-forward)?
18                return doLastNDays(cells, daysLeft % daysAgo);
19            }
20            
21        }
22        
23		// if we never get a cycle, the for-loop will exit on its own after N days.
24        return cells;
25    }
26    
27    // do N days of advancement
28    private int[] doLastNDays(int[] cells, int N) {
29        for(int i=0; i<N; i++) {
30            cells = nextDay(cells);
31        }
32        
33        return cells;
34    }
35    
36    // advance the state by one day
37    private int[] nextDay(int[] cells) {
38        int[] newCells = new int[8];
39        
40        for(int i=1; i<cells.length-1; i++) {
41            if(cells[i-1] == cells[i+1]) 
42                newCells[i] = 1;
43            else
44                newCells[i] = 0;
45        }
46
47        return newCells;     
48    }
49    
50}