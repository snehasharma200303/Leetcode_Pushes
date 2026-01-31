class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int count=0;
    for(int i=0;i<nums.length;i++){
        int currMax=0;
        while(i<nums.length && nums[i]==1) {
            currMax++;
            i++;
            }
        if(i==nums.length || nums[i]==0){
            count=Math.max(count,currMax);
        }
    }
    return count;
    }
}