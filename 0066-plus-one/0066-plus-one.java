class Solution {
    public int[] plusOne(int[] digits) {
         int n = digits.length;

        // Traverse from the last digit backwards
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add one and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Set current digit to 0 and continue to handle carry
            digits[i] = 0;
        }

        // If all digits were 9, we need to add an extra digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1; // The rest of the digits are 0 by default
        return result;
    }
}