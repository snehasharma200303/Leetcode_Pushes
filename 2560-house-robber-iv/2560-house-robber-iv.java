class Solution {
    public int minCapability(int[] nums, int k) {
       int l=Integer.MAX_VALUE;
       int r=Integer.MIN_VALUE;
       for(int val: nums){
        l=Math.min(val,l);
        r=Math.max(val,r);
       }
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