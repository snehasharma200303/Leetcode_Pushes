class Solution {
    public int maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0; // Edge case

        int[] minLeft = new int[n]; 
        int[] maxRight = new int[n];

        minLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            minLeft[i] = Math.min(minLeft[i - 1], nums[i]);
        }

        maxRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], nums[i]);
        }

        int maxValue = Integer.MIN_VALUE;
        for (int j = 1; j < n - 1; j++) {
            maxValue = Math.max(maxValue, minLeft[j - 1] - nums[j] + maxRight[j + 1]);
        }

        return maxValue;
    }
}
