class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int p=0,q=nums.length-1;
        int count=0;
        while(p<q){
            if((nums[p]+nums[q])==k){ 
                count++;
                p++;q--;
                }
            while(p<q && nums[p]+nums[q]>k) q--;
            while(p<q && nums[p]+nums[q]<k) p++;
        }
        return count;
    }
}