class Solution {
    public int minStartValue(int[] nums) {
        int minp=nums[0];int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=nums[i]+curr;
           minp=Math.min(curr,minp);
        }
        if(minp>=1) return 1;
        return 1-minp;
    }
}