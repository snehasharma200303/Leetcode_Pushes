class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[100];
        for(int i=0;i<100;i++) dp[i]=-1;
        return findRobber(dp,nums,0);
    }
    public int findRobber(int[] dp,int[] nums, int i){
        if(i>= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        dp[i]=Math.max(nums[i]+(findRobber(dp,nums,i+2)),(findRobber(dp,nums,i+1)));
        return dp[i];
    }
}