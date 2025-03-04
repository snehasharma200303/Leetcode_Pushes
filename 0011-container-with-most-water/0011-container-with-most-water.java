class Solution {
    public int maxArea(int[] height) {
        int p=0,q=height.length-1;
        int curr=0,secC=0;
    while(p <=q){
        secC=Math.max(curr,secC);
        int min=Math.min(height[p],height[q]);
        curr=min*(q-p);
        if(height[p]<height[q]) p++;
        else q--;
    }
    // if(height.length==2){
    //     return 1*curr;
    // }
    return secC;
    }
}