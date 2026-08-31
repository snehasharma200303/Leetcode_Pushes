class Solution {
    public int rob(int[] nums) { 
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1); 
        return findMax(dp,nums,0);
        
    }
    public int findMax(int[] dp,int[] nums, int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
      int take=nums[i]+findMax(dp,nums,i+2);
      int nonTake=findMax(dp,nums,i+1);
      return dp[i]=Math.max(take,nonTake);
    }

}