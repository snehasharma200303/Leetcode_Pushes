class Solution {
    public int minCapability(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        if(nums.length<=2) return nums[0];
        for(int i=0;i<nums.length;i++){
            int maxx=Integer.MIN_VALUE;
            for(int j=i+2;j<nums.length;j++){
                if(nums.length==3) return Math.min(nums[i],nums[j]);
                maxx=Math.max(nums[i],nums[j]);
                min=Math.min(maxx,min);
            }

        }
        return min;
    }
}