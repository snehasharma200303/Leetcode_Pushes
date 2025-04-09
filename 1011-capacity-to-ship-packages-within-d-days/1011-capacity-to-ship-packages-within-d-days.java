class Solution {
    // public int shipWithinDays(int[] weights, int days) {
    //     long l=Integer.MIN_VALUE,r=0;
    //     int ans=0;
    //     for(int w:weights){
    //       r+=(long)w;  
    //       l=Math.max(l,w);
    //     } 
    //     //System.out.println(l);
    //     while(l<=r){
    //         long mid=l+(r-l)/2;
    //         if(isValidW(weights,mid,days)){
    //             ans=(int)mid;
    //             r=mid-1;
    //         }
    //         else l=mid+1;
    //     }
    //     return ans;
    // }
    // public boolean isValidW(int[] weights,long mid, int days){
    //     int d=1;
    //     int cap=0;
    //     for(int i=0;i<weights.length;i++){
    //         if(cap+weights[i] <= mid){
    //             cap+=weights[i];
    //         }
    //         else{
    //             d++;
    //             cap=weights[i];
    //         }
    //     }
    //     if(d<=days) return true;
    //     return false;
    // }
     public static int shipWithinDays(int[] weights, int days) {
        int total = 0;
        int heaviest = 0;
        for (int weight : weights) {
            total += weight;
            heaviest = Math.max(heaviest,weight);
        }
        int left = Math.max(heaviest, total/days);
        int right = heaviest * (int) Math.ceil((double)weights.length/days);
        while (left < right) {
            int mid = left + (right-left) / 2;
            int daysNeeded = totalDay(weights,mid);
            if (daysNeeded <= days) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
    private static int totalDay(int[] weights, int capacity) {
        int days = 1, loaded = capacity;
        for (int i = 0, n = weights.length; i < n; i++) {
            if (loaded < weights[i]) {
                days++;
                loaded = capacity;
            }
            loaded -= weights[i];
        }
        return days;
    }
}