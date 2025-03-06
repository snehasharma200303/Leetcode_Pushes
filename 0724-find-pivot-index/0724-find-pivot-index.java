class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int pref=0;
        for(int i=0;i<n;i++){
            int suf=total-pref-nums[i];
            if(pref==suf) return i;
            pref+=nums[i];
        }
        return -1;
    }
}