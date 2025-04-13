class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int currMax=0;
        int totalSum=0;
        int currMin=0;
        for(int i :nums){
            totalSum+=i;
            currMax=Math.max(i,currMax+i);
            currMin=Math.min(i,currMin+i);
            max=Math.max(max,currMax);
            min=Math.min(min,currMin);
        }
        if(max<0) return max;
    return Math.max(max,totalSum-min);
    }
}