class Solution {
    public int[] sortArray(int[] nums) {
        int temp[] =new int[nums.length];
        mergesort(nums,temp,0,nums.length-1);
        return nums;
    }
    public void mergesort(int[] nums, int[] temp, int left, int right){
        if(left>=right) return;
        int mid=left+(right-left)/2;
        mergesort(nums,temp,left,mid);
        mergesort(nums,temp,mid+1,right);
        merge(nums,temp,left,mid,right);
    }
    public void merge(int[] nums,int[] temp,int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int k=left;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]) temp[k++]=nums[i++];
            else temp[k++]=nums[j++];
        }
        while(i<=mid) temp[k++]=nums[i++];
        while(j<=right) temp[k++]=nums[j++];
        for(int n=left;n<=right;n++){
            nums[n]=temp[n];
        }
    }
}