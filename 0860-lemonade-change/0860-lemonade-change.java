class Solution {
     static {
        for (int i = 0; i < 500; i++) {
            new Solution().lemonadeChange(new int[]{5,5,5,10,20});
        }
    }
    public boolean lemonadeChange(int[] bills) {
        int five=0,tens=0;
        for(int val: bills){
            if(val==5) {
                five++;
            }
            else if(val==10){
                if(five==0) return false;
                five-=1;
                tens+=1;
            }
            else{
                if(tens != 0  && five>0){
                tens-=1;
                five--;
                }
               else if(tens==0 && five>=3){
                    five-=3;
                }
                else return false;
            }
        }
        return true;
    }
}