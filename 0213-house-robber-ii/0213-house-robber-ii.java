class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==1) return nums[0];
        int dp1[] =new int[len];
        int dp2[] =new int[len];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int rob_0th=maxMoney(dp1,nums,0,len-1);
        int rob_1th=maxMoney(dp2,nums,1,len);
        return Math.max(rob_0th,rob_1th);
    }
    public int maxMoney(int[] dp,int[] nums, int i, int n){
        // if(i==n) return nums[i];
        if(i>=n) return 0;
        if(dp[i]!= -1) return dp[i];
        int step_2=maxMoney(dp,nums,i+2,n)+nums[i];
        int step_1=maxMoney(dp,nums,i+1,n);
        dp[i]= Math.max(step_2,step_1);
        return dp[i];
    }
}