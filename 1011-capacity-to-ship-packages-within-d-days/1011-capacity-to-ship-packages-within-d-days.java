class Solution {
    public int shipWithinDays(int[] weights, int days) {
        long l=Integer.MIN_VALUE,r=0;
        for(int w:weights){
          r+=(long)w;  
          l=Math.max(l,w);
        } 
        while(l<=r){
            long mid=l+(r-l)/2;
            if(isValidW(weights,mid,days)){
                r=mid-1;
            }
            else l=mid+1;
        }
        return (int)l;
    }
    public boolean isValidW(int[] weights,long mid, int days){
        int d=1;
        int cap=0;
        for(int i=0;i<weights.length;i++){
            if(cap+weights[i] <= mid){
                cap+=weights[i];
            }
            else{
                d++;
                cap=weights[i];
            }
        }
        if(d<=days) return true;
        return false;
    }
}