class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=piles[0];
        for(int p: piles) {
            r=Math.max(r,p);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isValidK(piles,mid,h)){
                r=mid-1;
            }
            else l=mid+1;
        }
        return l;
    }
    public boolean isValidK(int[] piles,int mid, int h){
        long hr=0;
            for(int i: piles){
                hr+=(i+mid-1)/mid;
            }
             return (hr<=h);
    }
}