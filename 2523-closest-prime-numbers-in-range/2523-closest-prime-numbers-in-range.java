class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ansA = {-1, -1};

        int n1 = -1, n2 = -1, min = Integer.MAX_VALUE;
        while (left <= right) {
            if (isPrime(left)) {
                if (n1 == -1) {
                    n1 = left;
                } else {
                    n2 = left;
                    int diff = n2 - n1;
                    if (diff < min) {
                        min = diff;
                        ansA[0] = n1;
                        ansA[1] = n2;
                    } 
                    else if (diff == min && n1 < ansA[0]) {
                        ansA[0] = n1;
                        ansA[1] = n2;
                    }
                    n1 = n2;
                }
            }
            left++;
        }
        return ansA;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
