class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
       return maxMoney(dp,nums,0);
    }
    public int maxMoney(int[] dp,int[] nums, int i){
        if(i== nums.length-1) return nums[i];
        if(i>=nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int daysPrev=nums[i]+maxMoney(dp,nums,i+2);
        int daysNext=maxMoney(dp,nums,i+1);
        dp[i]= Math.max(daysPrev,daysNext);
        return dp[i];
    }
}