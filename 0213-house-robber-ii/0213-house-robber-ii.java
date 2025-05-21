class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        for(int i=0;i<n;i++) {
            dp1[i]=-1;
            dp2[i]=-1;
        }
        int first=findRobber(dp1,nums,0,n-1);
        int second=findRobber(dp2,nums,1,n);
       return  Math.max(first,second);
    }
    public int findRobber(int[] dp,int[] nums, int i, int n){
        if(i>= n) return 0;
        if(dp[i] != -1) return dp[i];
        dp[i] =Math.max(nums[i]+findRobber(dp,nums,i+2,n),findRobber(dp,nums,i+1,n));
        return dp[i];
    }
}