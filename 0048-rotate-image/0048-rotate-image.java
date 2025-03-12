class Solution {
    public void rotate(int[][] Matrix) {
        int n=Matrix.length;
      int i = 0;
        while (i < n) {
            int j = i;
            while (j < n ) {
                swap(Matrix, i, j);
                j++;
            }
            i++;
        }
        i = 0;
        while (i < n) {
            int j = n - 1;
            int k = 0;
            while (k < j) {
                int temp = Matrix[i][k];
                Matrix[i][k] = Matrix[i][j];
                Matrix[i][j] = temp;
                k++;
                j--;
            }
            i++;
        }
    }
    public void swap(int[][] Matrix,int i, int j){
            int temp=Matrix[i][j];
            Matrix[i][j]=Matrix[j][i];
            Matrix[j][i]=temp;
    }
}