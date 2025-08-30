// Last updated: 8/30/2025, 10:55:11 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !isItSafe(board,i,j,board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
	public static boolean isItSafe(char[][]grid,int row,int col,char val) {
		for(int i=0;i<9;i++) {
			if(grid[i][col]==val && i!=row) {
				return false;
			}
		}
		for(int i=0;i<grid.length;i++) {
			if(grid[row][i]==val && i!=col) {
				return false;
			}
		}
		for(int i=row-row%3;i<row-row%3+3;i++) {
			for(int j=col-col%3;j<col-col%3+3;j++) {
				if(grid[i][j]==val && i!=row && j!=col) {
					return false;
				}
			}
		}
		return true;
	}
}