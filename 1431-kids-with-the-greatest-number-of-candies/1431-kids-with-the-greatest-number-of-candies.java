class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean> b=new ArrayList<>();
        for(int val: candies) max=Math.max(max,val);
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max) b.add(true);
            else b.add(false);
        }
        return b;
    }
}