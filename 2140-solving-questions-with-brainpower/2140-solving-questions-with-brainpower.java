class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];  // DP array for storing results

        for (int i = n - 1; i >= 0; i--) {
            int next = i + questions[i][1] + 1;
            long take = questions[i][0] + (next < n ? dp[next] : 0);
            long skip = dp[i + 1];
            dp[i] = Math.max(take, skip);
        }

        return dp[0];
    }
}
