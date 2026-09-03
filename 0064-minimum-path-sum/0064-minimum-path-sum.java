class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m+1][n+1];
        for(int[] d:dp) {
            Arrays.fill(d,-1);
            }
       return find(dp,grid,0,0,m,n);
    }
    public int find(int[][] dp,int[][] grid, int i,int j,int m , int n){
        if(i>=m-1 && j>=n-1) return grid[i][j];
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int a=0,b=0;
        a=find(dp,grid,i,j+1,m,n);
        b=find(dp,grid,i+1,j,m,n);
        return dp[i][j]=grid[i][j]+ Math.min(a,b);
    }
}