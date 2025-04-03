class Solution {
    public long maximumTripletValue(int[] nums) {
        long max1 = 0, maxDiff = 0, res = 0;
        
        for (int num : nums) {
            res = Math.max(res, maxDiff * num);
            maxDiff = Math.max(maxDiff, max1 - num);
            max1 = Math.max(max1, num);
        }
        
        return res;
    }
}
