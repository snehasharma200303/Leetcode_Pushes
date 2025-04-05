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
        int secMax=secMaxfind(breakIndex,nums);
        int temp=nums[breakIndex];
        nums[breakIndex]=nums[secMax];
        nums[secMax]=temp;
       nums=reverse(nums,breakIndex+1,n-1);
        
    }
    public int secMaxfind(int idx,int[] nums){
       for(int i=nums.length-1;i>idx;i--){
        if (nums[i] > nums[idx]) {
            return i;
        }
        }
        return -1;
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