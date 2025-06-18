class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValidSudokuHelperFunction(board,0,0);
    }
    public boolean isValidSudokuHelperFunction(char[][] board, int row, int col){
        if(row==9) return true;
       if(col==9) return isValidSudokuHelperFunction(board,row+1,0);
        if((board[row][col]!= '.')) {
        //   char num=board[row][col]; 
          if(!isValid(board[row][col],board,row,col)) return false;
        }        
            return isValidSudokuHelperFunction(board,row,col+1);
        }  
        
    public boolean isValid(char num,char[][] board, int row, int col){
        for(int i=0;i<9;i++){
            if(col != i && board[row][i]==num) return false;
            if(row != i && board[i][col]==num) return false;
        }
        int rowStart=(row/3)*3;
        int colStart=(col/3)*3;
        for(int i=rowStart;i<(rowStart+3);i++){
            for(int j=colStart;j<(colStart+3);j++){
                if(row != i && col != j && board[i][j]==num) return false;
            }
        }
        return true;
    }
}