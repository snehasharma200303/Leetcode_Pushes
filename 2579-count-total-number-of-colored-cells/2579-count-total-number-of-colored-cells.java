class Solution {
    public long coloredCells(int n) {
        long sum= (long)n*n + (long)(n-1)*(n-1);
        return sum;
    }
}