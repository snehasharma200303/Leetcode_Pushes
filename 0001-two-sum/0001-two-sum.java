class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums) list.add(i);
        for(int i=0;i<list.size();i++){
            int secN=target-(list.get(i));
            if(i!=list.indexOf(secN) && list.contains(secN)){
                arr[0]=i;
                arr[1]=list.indexOf(secN);
                return arr;
            }
        }
        return arr;
    }
}