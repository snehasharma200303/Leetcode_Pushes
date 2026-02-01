class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] newArr=new int[n];
        int p=0,q=n-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            newArr[p]=nums[i];p++;
        }
        else{
            newArr[q]=nums[i];q--;
        }
       }
         p=0;q=n-1;
       for(int i=0;i<nums.length;i++){
        nums[i++]=newArr[p];
        nums[i]=newArr[q];
        p++;q--;
       }
       return nums;
    }
}