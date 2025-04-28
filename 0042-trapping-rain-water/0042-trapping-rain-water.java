class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax=0;
        int rightmax=0;
        int left=0,right=n-1;
        int maxwater=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(leftmax<=height[left]){
                    leftmax=height[left];
                }
                else maxwater+=leftmax-height[left];
                left++;
            }
            else{
                if(rightmax<=height[right]){
                    rightmax=height[right];
                }
                else maxwater+=rightmax-height[right];
                right--;
            }
        }
        return maxwater;
    }
}