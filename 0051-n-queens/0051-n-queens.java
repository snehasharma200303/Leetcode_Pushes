class Solution {
    public List<List<String>> solveNQueens(int n) {
        String[][] arr=new String[n][n];
        for(String[] i:arr) Arrays.fill(i,".");
        List<List<String>> list=new ArrayList<>();
         findPosition(n,arr,list,0,0);
         return list;
    }
    public void findPosition(int Q, String[][] board, List<List<String>> Ans,int row, int col){
        if(Q==0 && row==board.length){
            List<String> curr=new ArrayList<>();
           for(int i=0;i<board.length;i++){
            String s="";
            for(int j=0;j<board.length;j++){
                s+=board[i][j];
            }
            curr.add(s);
           
           }
            Ans.add(curr);
            return;
        }
        if(row==board.length || col==board.length) return;
        boolean check=false;
             if(isSafe(row,col,board)){
                check=true;
            board[row][col]="Q";
            findPosition(Q-1,board,Ans,row+1,0); 
            board[row][col]="."; 
            
        }
          
          if(check){
            Q++;
          }
          findPosition(Q,board,Ans,row,col+1); 
        return;
    }
    public boolean isSafe(int row,int col, String[][] board){
        int r=row;
        int c=col;
        //Verticle
        while(r>0){
            if(board[r-1][c]=="Q") return false;
            r--;
        }
        //left Digonal
        r=row;c=col;
        while(r>0 && c>0){
            if(board[r-1][c-1]=="Q") return false;
            r--;c--;
        }
        // right Digonal
        r=row;c=col;
        while(r>0 && c<board.length-1){
            if(board[r-1][c+1]=="Q") return false;
            r--; c++;
        }
        return true;
    }
}