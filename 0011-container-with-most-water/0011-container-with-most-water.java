class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int area=Integer.MIN_VALUE;
        while(left<right){
            int b=right-left;
            int h=Math.min(height[left],height[right]);
            area=Math.max(area,b*h);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return area;
    }
}