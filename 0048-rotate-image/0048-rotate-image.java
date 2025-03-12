class Solution {
    public void rotate(int[][] arr) {
      int i = 0;
        while (i < arr.length) {
            int j = i;
            while (j < arr[i].length) {
                swap(arr, i, j);
                j++;
            }
            i++;
        }
        i = 0;
        while (i < arr.length) {
            int j = arr[i].length - 1;
            int k = 0;
            while (k < j) {
                int temp = arr[i][k];
                arr[i][k] = arr[i][j];
                arr[i][j] = temp;
                k++;
                j--;
            }
            i++;
        }
    }
    public void swap(int[][] arr,int i, int j){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
    }
}