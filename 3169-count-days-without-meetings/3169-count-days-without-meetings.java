

class Solution {
    public int countDays(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int freeDays = 0, lastEnd = 0;
        
        for (int[] m : meetings) {
            if (m[0] > lastEnd + 1) freeDays += m[0] - lastEnd - 1;
            lastEnd = Math.max(lastEnd, m[1]);
        }
        
        return freeDays + (n - lastEnd);
    }
}
