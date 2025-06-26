class Solution {
    public int totalNQueens(int n) {
        String[][] board=new String[n][n];
        for(String[] b:board) Arrays.fill(b,".");
         return findPathForQueen(n,board,0,0);
    }
    public int findPathForQueen(int q, String[][] board, int row, int col){
        if(q==0 && row==board.length)  {
            return 1;
        }
        if(row==board.length || col==board.length) return 0;
        boolean check=false;
        int ans=0;
        if(isSafe(row,col,board)){
            check=true;
            board[row][col]="Q";
            q--;
           ans+= findPathForQueen(q,board,row+1,0);
            board[row][col]=".";

        }
        if(check) q++;
        ans+=findPathForQueen(q,board,row,col+1);
         return ans;
    }
    public boolean isSafe(int row,int col, String[][] board){
        int r=row,c=col;
        while(r>0){
            if(board[r-1][c]=="Q") return false;
            r--;
        }
        r=row;c=col;
        while(r>0 && c>0){
            if(board[r-1][c-1]=="Q") return false;
          r--;c--;
        }
        r=row;c=col;
        while(r>0 && c<board.length-1){
            if(board[r-1][c+1]=="Q") return false;
            r--;c++;
        }
        return true;
    }
}