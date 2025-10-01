class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i+=1){
            if(n==0) return true;
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1] != 1)  && (i>=flowerbed.length-1 || flowerbed[i+1]!=1)) {
                flowerbed[i]=1;
                n--;}
            
        }
        if(n!=0 && flowerbed[flowerbed.length-1]!=1 && flowerbed[flowerbed.length-2]!=1) n--;
        return n==0?true:false;
    }
}