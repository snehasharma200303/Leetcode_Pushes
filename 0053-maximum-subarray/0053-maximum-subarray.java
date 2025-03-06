class Solution {
    public int maxSubArray(int[] nums) {
      int[] preA=new int[nums.length];
      preA[0]=nums[0];
      for(int i=1;i<nums.length;i++){
        preA[i]=nums[i]+preA[i-1];
      }  
      int minP=0;
      int maxS=Integer.MIN_VALUE;
      for(int i=0;i<preA.length;i++){
        int currS=preA[i]-minP;
        maxS=Math.max(maxS,currS);
        minP=Math.min(minP,preA[i]);
      }
      return maxS;
    }
}