class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int prod=1;
        int count0=0;
        boolean check0=false;
        for(int val:nums) {
            if(val ==0) {
                count0++;
                }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) check0=true;
            if(count0!=nums.length && nums[i]==0) continue;
            else prod*=nums[i];
        } 
        for(int i=0;i<nums.length;i++){
            if(check0 && nums[i]!=0) answer[i]=0;
            else if(check0 && nums[i]==0) answer[i]=prod;
            else if(!check0 && nums[i] !=0) answer[i]=prod/nums[i];

        }
        return answer;
    }
}