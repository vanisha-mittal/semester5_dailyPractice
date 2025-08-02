// Last updated: 8/2/2025, 4:05:01 PM
class Solution {
    public void solveSudoku(char[][] board) {
        Print(board, 0, 0);
	}
	public static boolean Print(char[][] grid,int row, int col) {
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			return true;
		}
		if(grid[row][col]!='.') {
			return Print(grid,row,col+1);
		}
		else {
			for(char val='1';val<='9';val++) {
				if(isItSafe(grid,row,col,val)) {
					grid[row][col]=val;
					boolean ans=Print(grid,row,col+1);
					if(ans) {
						return true;
					}
					grid[row][col]='.';
				}
			}
		}
		return false;
	}
	public static boolean isItSafe(char[][]grid,int row,int col,char val) {
		for(int i=0;i<grid.length;i++) {
			if(grid[i][col]==val) {
				return false;
			}
		}
		for(int i=0;i<grid.length;i++) {
			if(grid[row][i]==val) {
				return false;
			}
		}
		for(int i=row-row%3;i<row-row%3+3;i++) {
			for(int j=col-col%3;j<col-col%3+3;j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}
}