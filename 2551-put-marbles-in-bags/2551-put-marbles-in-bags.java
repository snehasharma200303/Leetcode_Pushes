import java.util.*;

class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if (k == 1) return 0;

        List<Integer> pairwiseSums = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            pairwiseSums.add(weights[i] + weights[i + 1]);
        }

        Collections.sort(pairwiseSums);

        long minSum = 0, maxSum = 0;
        int len = pairwiseSums.size();

        for (int i = 0; i < k - 1; i++) {
            minSum += pairwiseSums.get(i);
        }
        for (int i = 0; i < k - 1; i++) {
            maxSum += pairwiseSums.get(len - 1 - i);
        }

        return maxSum - minSum;
    }
}
