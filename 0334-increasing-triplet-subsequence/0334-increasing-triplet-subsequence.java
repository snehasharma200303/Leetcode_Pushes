class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        if(n<3) return false;
        int first=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        for(int val: nums){
            if(val<=first) first=val;
            else if(val<=sec) sec=val;
            else return true;
        }
        return false;
    }
}