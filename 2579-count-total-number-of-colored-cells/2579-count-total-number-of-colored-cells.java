class Solution {
    public long coloredCells(int n) {
        long ans=1;
        long sum=0;
        for(int i=1;i<n+1;i++){
            sum+=ans;
            ans=i*4;

        }
        return sum;
    }
}