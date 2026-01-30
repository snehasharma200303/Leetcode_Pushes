class Solution {
    public int missingNumber(int[] nums) {
       int[] arr=new int[nums.length+1];
       for(int i:nums){
        arr[i]=1;
       }
       for(int i=1;i<arr.length;i++){
        if(arr[i]==0) return i;
       }
       return 0;
    }
}