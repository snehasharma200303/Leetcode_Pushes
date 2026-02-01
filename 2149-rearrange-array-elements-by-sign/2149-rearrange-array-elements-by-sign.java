class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
       for(int i=0, p=0,q=0;i<nums.length;i++){
        if(nums[i]>0){
            pos[p]=nums[i];p++;
        }
        else{
            neg[q]=nums[i];q++;
        }
       }
        int p=0,q=0;
       for(int i=0;i<nums.length;i++){
        nums[i++]=pos[p];
        nums[i]=neg[q];
        p++;q++;
       }
       return nums;
    }
}