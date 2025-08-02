// Last updated: 8/2/2025, 4:04:41 PM
class Solution {
    public int totalNQueens(int n) {
		boolean [][]board=new boolean[n][n];
		return print(board,0,n);
	}
	public static int print(boolean[][] board,int row,int tq) {
		if(tq==0) {
			return 1;
		}
        int c=0;
		for(int col=0;col<board[0].length;col++) {
			if(isItSafe(board,row,col)) {
				board[row][col]=true;
				c+=print(board,row+1,tq-1);
				board[row][col]=false;
			}
		}
        return c;
	}
	public static boolean isItSafe(boolean[][] board,int row,int col) {
		//up
		int r=row;
		while(r>=0) {
			if(board[r][col]) {
				 return false;
			 }
			r--;
		}
		 //right diagonal
		 r=row;
		 int c=col;
		 while(c<board[0].length && r>=0) {
			 if(board[r][c]) {
				 return false;
			 }
			 r--;
			 c++;
		 }
		 //left diagonal
		 r=row;
		 c=col;
		 while(c>=0 && r>=0) {
			 if(board[r][c]) {
				 return false;
			 }
			 r--;
			 c--;
		 }
		 return true;
	}

}
