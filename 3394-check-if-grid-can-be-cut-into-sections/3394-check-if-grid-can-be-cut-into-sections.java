import java.util.*;

class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return canCut(rectangles, 0) || canCut(rectangles, 1);
    }

    private boolean canCut(int[][] rects, int d) {
        Arrays.sort(rects, Comparator.comparingInt(a -> a[d]));
        int gaps = 0, end = rects[0][d + 2];

        for (int i = 1; i < rects.length; i++) {
            if (end <= rects[i][d]) gaps++;
            end = Math.max(end, rects[i][d + 2]);
        }
        return gaps >= 2;
    }
}
