class Solution {
    public void nextPermutation(int[] nums) {
        int breakIndex=0;
        int n=nums.length;
        boolean flag=true;
        for(int i=n-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                flag=false;
                breakIndex=i-1;
            break;
            } 
        }
        if(flag){
            reverse(nums,0,n-1);
           return;  
        } 
        for (int i = n - 1; i > breakIndex; i--) {
            if (nums[i] > nums[breakIndex]) {
                swap(nums, i, breakIndex);
                break;
            }
        }

       reverse(nums,breakIndex+1,n-1);
        
    }
       private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public int[] reverse(int[] nums, int l,int r){
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;r--;
        }
        return nums;
    }
}