class Solution {
    public int minStartValue(int[] nums) {
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        int minp=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=nums[i]+arr[i-1];
            if(minp>arr[i]) minp=arr[i];
        }
        if(minp>=1) return 1;
        return 1-minp;
    }
}