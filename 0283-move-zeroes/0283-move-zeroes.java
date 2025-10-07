class Solution {
    public void moveZeroes(int[] nums) {
        int p=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[p];
                nums[p]=nums[right];
                nums[right]=0;
                p++;
            }
        }
        return;
    }
}