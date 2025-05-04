class Solution {
    public int rob(int[] nums) {
        if(nums.length<=1) return nums[0];
        int[] dp1=new int[nums.length];
        int[] dp2=new int[nums.length];
        int rob1= robber(nums,0,nums.length-1,dp1);
        int rob2= robber(nums,1,nums.length,dp2);
        return Math.max(rob1,rob2);
    }
    public int robber(int[] nums, int i,int j,int[] dp){
        if(i>= j) return 0;
         if(dp[i] != 0) return dp[i];
        int f=nums[i]+robber(nums,i+2,j,dp);
       int l=robber(nums,i+1,j,dp);
        dp[i]= Math.max(f,l);
        return dp[i];
    }
}