// Last updated: 3/10/2026, 7:11:11 PM
1class Solution {
2    public void gameOfLife(int[][] matrix) {
3
4        // number of rows
5        int n = matrix.length;
6
7        // number of columns
8        int m = matrix[0].length;
9
10        // creating a duplicate matrix to store state
11        int[][] dup = new int[n][m];
12        for(int i = 0; i < n; i++ ){
13            for(int j = 0; j < m ; j++ ){
14                dup[i][j]=matrix[i][j];
15            }
16        }
17
18        // iterating through matrix
19        for(int i = 0; i < n; i++ ){
20            for(int j = 0; j < m; j++ ){
21
22                // counting state of 8 neighbours
23                // always run 9 times -> Time :: O(1) 
24                int sum = 0;
25                for(int x = -1; x <= 1 ; x++ ){
26                    for(int y = -1; y <= 1 ; y++){
27                        int r=i+x;
28                        int c=j+y;
29                        if( r >= 0 && c >= 0 && r < n && c < m){
30                            // neglect its own status
31                            if(x==0 && y==0){
32                                continue;
33                            }else{
34                                sum+=dup[r][c];
35                            }
36                        }
37                    }
38                }
39
40                // checking current state of element
41                if(dup[i][j] == 1){
42                    if(sum < 2) matrix[i][j]=0;
43                    else if(sum > 3) matrix[i][j]=0;
44                }else{
45                    if(sum == 3) matrix[i][j]=1;
46                }
47            }
48        }
49    }
50}