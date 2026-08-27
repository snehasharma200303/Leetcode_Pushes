class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1,mid=0;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;mid++;
            }
            else mid++;
        }
    }
    public void swap(int[] nums,int mid,int h){
        int temp=nums[mid];
        nums[mid]=nums[h];
        nums[h]=temp;
    }
}