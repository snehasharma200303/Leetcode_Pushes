class pair{
    int r; 
    int c;
    public pair(int r, int c){
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean[][] vis=new boolean[row][col]; //visited nodes
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 if(grid[i][j]=='1' && vis[i][j]==false){
                    bfs(i,j,grid,vis);
                    count++;
                 }
            }
        }
        return count;
    }
    public void bfs(int i, int  j,char[][] grid,boolean[][] vis){
        vis[i][j]=true;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(i,j));
        int rl[]={1,0,0,-1}; //U,R,D,L
        int cl[]={0,-1,1,0};
        while(!q.isEmpty()){
            pair p=q.poll();
            int row=p.r;
            int col=p.c;
            for(int k=0;k<4;k++){
                int nRow=row+rl[k];
                int nCol=col+cl[k];
                if(nRow>=0 && nRow<grid.length && nCol>=0 && nCol<grid[0].length && grid[nRow][nCol]=='1' && vis[nRow][nCol]==false){
                    vis[nRow][nCol]=true;
                    q.add(new pair(nRow,nCol));
                }
            }
        }
    }
}