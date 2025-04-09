class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        int k=0;
        for(int p: piles) r+=p;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isValidK(piles,mid,h)){
                k=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return k;
    }
    public boolean isValidK(int[] piles,int mid, int h){
        int hr=0;
            for(int i=0;i<piles.length;i++){
                if(mid>=piles[i]) hr++;
                else{
                    hr+=piles[i]/mid;
                    if(piles[i]%mid <mid) hr++;
                }
            }
            if(hr<=h) return true;
            return false;
    }
}