class Solution {
    public int maxSubArray(int[] nums) {
        int largestSum=Integer.MIN_VALUE;
        int curr=0;
        for(int val:nums){
            curr=Math.max(val,curr+val);
            largestSum=Math.max(curr,largestSum);
        }
        return largestSum;
    }
}