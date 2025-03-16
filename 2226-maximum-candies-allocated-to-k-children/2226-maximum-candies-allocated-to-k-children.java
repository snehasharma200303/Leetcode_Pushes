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
// class Solution {
//     public int maximumCandies(int[] a, long k) {
//          int lo = 1, hi = 0, ans = 0;
//         for (int x : a) hi = Math.max(hi, x);
//         while (lo <= hi) {
//             int mid = (lo + hi) >>> 1;
//             long cnt = 0;
//             for (int x : a) cnt += x / mid;
//             if (cnt >= k) { ans = mid; lo = mid + 1; }
//             else hi = mid - 1;
//         }
//         return ans;
//     }
// }