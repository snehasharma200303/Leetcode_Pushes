class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avgMax=0;
        for(int i=0;i<k;i++){
            avgMax+=(double)nums[i];
        }
        
        int p=0,q=k;
        while(q<nums.length){
            double current=(double)(avgMax-nums[p]+nums[q]);
            avgMax=Math.max(current,avgMax);
            p++;q++;
        }
        return avgMax/k;
    }
}