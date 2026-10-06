class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
       for(int val: nums){
        if(val==0) zero++;
        else if(val==1) one++;
       }
       int i=0;
      while(zero--!=0) nums[i++]=0;
      while(one--!=0) nums[i++]=1;
      while(i<nums.length) nums[i++]=2;
    }
}