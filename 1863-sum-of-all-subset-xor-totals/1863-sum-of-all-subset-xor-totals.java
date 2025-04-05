class Solution {
    public int subsetXORSum(int[] nums) {
        return calTotalXorSum(nums,0,0);
    }
    public int calTotalXorSum(int[] nums, int idx, int currXor){
        if(idx>=nums.length){
            return currXor;
        }
        int s1= calTotalXorSum(nums, idx+1,nums[idx]^currXor) + calTotalXorSum(nums, idx+1,currXor);
        return s1;
    }
}