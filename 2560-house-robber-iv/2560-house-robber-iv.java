class Solution {
    public int minCapability(int[] nums, int k) {
       int l=1;
       int r=1000000000;
       while(l<r){
        int mid=l+(r-l)/2;
        if(isValid(nums,k, mid)){
            r=mid;
        }
        else l=mid+1;
       }
       return l;
    }
    public boolean isValid(int[] nums, int k,int mid){
       int count=0;
       int i=0;
       while(i<nums.length){
        if(nums[i]<=mid) {
            count++;
            i++;
        }
        i++;
       }
    return count>=k;
    }    
}