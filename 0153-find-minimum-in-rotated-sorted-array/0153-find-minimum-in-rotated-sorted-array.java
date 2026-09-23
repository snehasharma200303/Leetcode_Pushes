class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        int min=Integer.MAX_VALUE;
        if(nums[left]<nums[right]) return nums[left];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[left]<=nums[mid]){
                if(min>nums[left])  min=nums[left];
                left=mid+1;
            }
            else{
                min=nums[mid];
                right=mid-1;
            }
        }
        return min;
    }
}