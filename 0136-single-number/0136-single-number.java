import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        for (int num : nums) {
            int count = 0; // ye count krega number of elements ko for every value of  num
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1; // Or throw an exception if no single number found
    }
}