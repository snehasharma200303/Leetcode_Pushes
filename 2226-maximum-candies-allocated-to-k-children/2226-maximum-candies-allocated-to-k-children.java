class Solution {
    public int maximumCandies(int[] a, long k) {
         int lo = 1, hi = 0, ans = 0;
        for (int x : a) hi = Math.max(hi, x);
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            long cnt = 0;
            for (int x : a) cnt += x / mid;
            if (cnt >= k) { ans = mid; lo = mid + 1; }
            else hi = mid - 1;
        }
        return ans;
    }
}