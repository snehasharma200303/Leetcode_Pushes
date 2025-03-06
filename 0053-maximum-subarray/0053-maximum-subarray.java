class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0], currmax=nums[0];
         
        for(int i=1;i<nums.length;i++){
            currmax=Math.max(nums[i],nums[i]+currmax);
            max=Math.max(currmax,max);
        }
        return max;
    }
    
}