class Solution { 
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int[] v:dp) Arrays.fill(v,-1);
         int res= coincha(dp,coins,amount,n);
         return res==(int)1e9?-1:res;
    }
    public int coincha(int[][] dp,int[] coins, int amount,int n){
        if(amount==0){
            return 0;
        }
          if(amount<0 || n==0) return (int)1e9; 
        if(dp[n][amount] != -1) return dp[n][amount];
      
        int f=1+coincha(dp,coins,amount-coins[n-1],n);
       int e=coincha(dp,coins,amount,n-1);
       return dp[n][amount]=Math.min(f,e);
    }
}