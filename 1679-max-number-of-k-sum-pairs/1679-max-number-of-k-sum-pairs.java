class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int p=0,q=nums.length-1;
        int count=0;
        while(p<q){
            if((nums[p]+nums[q])==k){ 
                count++;
                // nums[p]=-1;nums[q]=-1;
                p++;q--;
                }
            else if((nums[p]+nums[q])>k)q--;
            else p++;
        }
        return count;
    }
}