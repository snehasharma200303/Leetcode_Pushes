class NumMatrix {
        int[][] m;
    public NumMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        m=new int[r+1][c+1];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            m[i + 1][j + 1] = matrix[i][j]  + m[i][j + 1] + m[i + 1][j] - m[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
       return m[row2+1][col2+1]-m[row1][col2+1]-m[row2+1][col1]+m[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */