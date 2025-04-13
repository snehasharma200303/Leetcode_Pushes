class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,r=0;
        for(int i:nums){
            l=Math.max(l,i);
            r+=i;
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isValid(nums,k,mid)){
                r=mid-1;
            }
            else l=mid+1;
        }
        return l;
    }
    public boolean isValid(int[] nums, int k, int mid){
        int ktimes=1;
        long sum=0;
        for(int i:nums){
            if(i>mid) return false;
            if(sum+i <= mid){
                sum+=i;
            }
            else{
                ktimes++;
                sum=i;
            }
        }
        return ktimes<=k;
    }
}