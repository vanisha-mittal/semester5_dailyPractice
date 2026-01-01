// Last updated: 1/1/2026, 11:30:10 AM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> ans=new ArrayList<>();
4		char [][]board=new char[n][n];
5        for(int i=0;i<n;i++){
6            Arrays.fill(board[i],'.');
7        }
8		print(board,0,n,ans);
9        return ans;
10	}
11	public static void print(char[][] board,int row,int tq,List<List<String>> ans) {
12		if(tq==0) {
13            List<String> sol=new ArrayList<>();
14            for(char[] a:board){
15                sol.add(new String(a));
16            }
17            ans.add(sol);
18			return;
19		}
20		for(int col=0;col<board[0].length;col++) {
21			if(isItSafe(board,row,col)) {
22				board[row][col]='Q';
23				print(board,row+1,tq-1,ans);
24				board[row][col]='.';
25			}
26		}
27	}
28	public static boolean isItSafe(char[][] board,int row,int col) {
29		//up
30		int r=row;
31		while(r>=0) {
32			if(board[r][col]=='Q') {
33				 return false;
34			 }
35			r--;
36		}
37		 //right diagonal
38		 r=row;
39		 int c=col;
40		 while(c<board[0].length && r>=0) {
41			 if(board[r][c]=='Q') {
42				 return false;
43			 }
44			 r--;
45			 c++;
46		 }
47		 //left diagonal
48		 r=row;
49		 c=col;
50		 while(c>=0 && r>=0) {
51			 if(board[r][c]=='Q') {
52				 return false;
53			 }
54			 r--;
55			 c--;
56		 }
57		 return true;
58	}
59	
60
61}