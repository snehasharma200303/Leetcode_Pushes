class Solution {
    public int maxSubArray(int[] nums) {
        return max(nums, 1, nums[0],nums[0]);
        
    }
    public int max(int[] nums, int i, int Mmax,int currM){
        if(i>=nums.length) return Mmax;
       currM=Math.max(nums[i],nums[i]+currM);
        Mmax=Math.max(currM,Mmax);
        return max(nums, i+1,Mmax,currM);
    }
    
}