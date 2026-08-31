class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
       return Math.max(findMax(dp1,nums,0,n-1),findMax(dp2,nums,1,n));
    }
    public int findMax(int[] dp,int[] nums,int i, int j){
        if(i>(j-1)) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+findMax(dp,nums,i+2,j);
        int skip=findMax(dp,nums,i+1,j);
        return dp[i]= Math.max(take,skip);
    }
}
