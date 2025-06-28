class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==1) return nums[0];
     int next_0=0;
     int ans_1=nums[len-2];
     for(int i=len-3;i>=0;i--){
        int temp=ans_1;
        ans_1=nums[i]+next_0;
        next_0=temp;
        ans_1=Math.max(ans_1,next_0);
     }
    int ans_2=nums[len-1];
    next_0=0;
     for(int i=len-2;i>=1;i--){
        int temp=ans_2;
        ans_2=nums[i]+next_0;
        next_0=temp;
        ans_2=Math.max(ans_2,next_0);
     }
     return Math.max(ans_1,ans_2);
    }
}