class Solution {
    public int countDays(int days, int[][] meetings) {
       HashSet<Integer> set=new HashSet<>();
       int count=0;
        for(int i=0;i<meetings.length;i++){
            int s=meetings[i][0],end=meetings[i][1];
            while(s<=end){
                if(!set.contains(s)) {
                    count++;
                    set.add(s);
                }
            s++;
            }
        }
        return days-count;
    }
}