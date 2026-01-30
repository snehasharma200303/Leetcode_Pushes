import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int expected_sum=0;
        int n=nums.length;
        int actual_sum = n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
           expected_sum+=nums[i];
        }
        if(expected_sum!=actual_sum){
            int missing_num=actual_sum-expected_sum;
            return missing_num;
        }
        return 0;
    }
}