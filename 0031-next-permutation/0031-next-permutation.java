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
          Arrays.sort(nums);
           return;  
        } 
        int secMax=secMaxfind(breakIndex,nums);
        int temp=nums[breakIndex];
        nums[breakIndex]=nums[secMax];
        nums[secMax]=temp;
       nums=reverse(nums,breakIndex);
        
    }
    public int secMaxfind(int idx,int[] nums){
    int secMax=Integer.MAX_VALUE;
       for(int i=nums.length-1;i>=idx;i--){
        if(nums[i]>nums[idx] && nums[i]<secMax){
            secMax=i;
        }
        }
        return (secMax==Integer.MAX_VALUE ? -1 : secMax);
    }
    public int[] reverse(int[] nums, int idx){
        int l=idx+1,r=nums.length-1;
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;r--;
        }
        return nums;
    }
}