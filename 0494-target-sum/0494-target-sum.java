class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int offset=0;
        for(int val:nums) offset+=val;
        int[][] dp=new int[nums.length][2*offset+1];
        for(int [] arr:dp) Arrays.fill(arr,-1);
        return findWays(dp,nums,target,0,offset);
    }
    public int findWays(int[][] dp,int nums[],int target, int i,int offset){
        if (target < -offset || target > offset) {
        return 0;
    }
        if(i>=nums.length) return (target==0)?1:0;
        if(dp[i][target+offset]!=-1 ) return dp[i][target+offset];
        int  c1=findWays(dp,nums,target-nums[i],i+1,offset);
        int  c2=findWays(dp,nums,target+nums[i],i+1,offset);
        return dp[i][target+offset]=c1+c2;
    }
}