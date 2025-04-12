class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                if(mid==0 || (nums[mid-1]<=target)) r=mid-1;
                else l=mid+1;
            }
            else if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        l=0;r=nums.length-1;
         while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                if(mid==nums.length-1 || (nums[mid+1]>=target)) l=mid+1;
                else r=mid-1;
            }
            else if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return ans;
    }
}