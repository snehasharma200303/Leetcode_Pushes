class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2 != 0) return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val: nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int v: map.keySet()){
            if(map.get(v) %2 != 0) return false;
        }
        return true;
    }
}