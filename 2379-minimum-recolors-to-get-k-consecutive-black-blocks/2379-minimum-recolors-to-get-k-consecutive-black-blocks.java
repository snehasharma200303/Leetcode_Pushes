class Solution {
    public int minimumRecolors(String s, int k) {
       int minWays=Integer.MAX_VALUE;
       for(int i=0;i<s.length()-k+1;i++){
        int currMin=0;
        for(int j=0;j<k;j++){
            if(minWays==0) return minWays;
            if(s.charAt(i+j)=='W') currMin++;
            
        }
        minWays=Math.min(minWays,currMin);
       }
       return minWays;
    }
}