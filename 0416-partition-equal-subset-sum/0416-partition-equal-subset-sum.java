class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
       
        for(int val:nums) sum+=val;
        if(sum%2!=0) return false;
         int dp[][]=new int[nums.length][sum/2+1];
         for(int[] val:dp){
            Arrays.fill(val,-1);
         }
        return (find(dp,sum/2,nums,0)==0)?false:true;
    }
    public int find(int[][] dp,int sum,int[] nums,int i){
        if(sum==0) return 1;
        if(sum<0 || i>=nums.length) return 0;
        if(dp[i][sum]!=-1) return dp[i][sum];
       return dp[i][sum]= (find(dp,sum-nums[i],nums,i+1) ==1 || find(dp,sum,nums,i+1)==1)?1:0;
    }
}