class Solution {
    public long coloredCells(int n) {
        long ans=1;
        long sum=0;
        while(n-->0){
            sum+=ans;
            ans*=4;

        }
        return sum;
    }
}