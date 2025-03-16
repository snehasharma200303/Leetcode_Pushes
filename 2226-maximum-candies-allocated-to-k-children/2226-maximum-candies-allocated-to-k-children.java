class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left=1, right=Arrays.stream(candies).max().getAsInt();
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isValidCandy(candies,k,mid)){
                left=mid+1;
            }
            else right=mid-1;
        }
        return right;
    }
    private boolean isValidCandy(int[] arr, long k, int mid){
        long child=0;
        for(int val:arr){
           child+=val/mid;
            if(child>=k) return true;
        }
        return false;
    }
}
