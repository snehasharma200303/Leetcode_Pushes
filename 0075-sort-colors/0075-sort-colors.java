class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            if(nums[l]==0) l++;
            if(nums[r]==2) r--;
            else if(nums[l]==2 && nums[r]==0){
                nums[l]=0;
                nums[r]=2;
                l++;r--;
            }
            else if(nums[l]==2 && nums[r]==1){
                nums[l]=1;
                nums[r]=2;
                r--;
            }
            else if(nums[l]==1 && nums[r]==0){
                nums[l]=0;
                nums[r]=1;
                l++;
            }
            else{
                if(l<=r-1){
                int temp=nums[r-1];
                nums[r-1]=nums[l];
            nums[l]=temp;
            l++;}
            }
        }
    }
}