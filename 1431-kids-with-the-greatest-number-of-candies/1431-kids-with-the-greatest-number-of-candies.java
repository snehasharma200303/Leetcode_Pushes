class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean> b=new ArrayList<>();
        for(int val: candies) max=Math.max(max,val);
        for(int i=0;i<candies.length;i++){
            b.add((candies[i]+extraCandies)>=max);
        }
        return b;
    }
}