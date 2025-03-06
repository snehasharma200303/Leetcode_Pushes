class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] newArr=new int[grid.length*grid[0].length];
        int[] ansArr=new int[2];
        int k=0;
         int sum=newArr.length*(newArr.length+1)/2;
            int currsum=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    newArr[k++]=grid[i][j];
                    currsum+=grid[i][j];
                }
            }
            Arrays.sort(newArr);
            for(int i=1;i<newArr.length;i++){
                if(newArr[i]==newArr[i-1]){
                     ansArr[0]=newArr[i];
                break;
                }
            }
            currsum-=ansArr[0];
          ansArr[1]=sum-currsum;
            return ansArr;
    }
}