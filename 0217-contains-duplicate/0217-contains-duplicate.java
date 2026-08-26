class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int val=nums[i];
        if(map.containsKey(val)) {
            if(map.get(val)>1)
            return true;
            }
        map.put(val,map.getOrDefault(val,1)+1);
      }
        return false;
    }
}