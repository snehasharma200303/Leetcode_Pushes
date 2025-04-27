class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        int maxwater=0;
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        for(int i=1,j=n-2;i<n;i++,j--){
            if(leftmax[i-1]<height[i]) leftmax[i]=height[i];
            else leftmax[i]=leftmax[i-1];
            if(rightmax[j+1]<height[j]) rightmax[j]=height[j];
            else rightmax[j]=rightmax[j+1];
        }
        for(int i=0;i<n;i++){
            maxwater+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return maxwater;
    }
}