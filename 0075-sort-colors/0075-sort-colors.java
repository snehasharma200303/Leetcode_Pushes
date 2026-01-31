class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i:nums){
            if(i==0) count0++;
           else if(i==1) count1++;
           else count2++;
        }
        int trav=0;
        while(count0-- > 0) nums[trav++]=0;
        while(count1-- > 0) nums[trav++]=1;
        while(count2-- > 0) nums[trav++]=2;
    }
}