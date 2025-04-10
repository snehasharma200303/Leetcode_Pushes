class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long l=1,r=piles[0];
        for(int p: piles) {
            r=Math.max(r,p);
        }
        while(l<=r){
            long mid=l+(r-l)/2;
            if(isValidK(piles,mid,h)){
                r=mid-1;
            }
            else l=mid+1;
        }
        return (int)l;
    }
    public boolean isValidK(int[] piles,long mid, int h){
        int hr=0;
            for(int i=0;i<piles.length;i++){
                if(mid>=piles[i]) hr++;
                else{
                   hr+=piles[i]/mid;
                   if(piles[i]%mid != 0) hr++;      
                }
            }
            if(hr<=h) return true;
            return false;
    }
}