class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> map=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        int val=nums[i];
        if(map.contains(val)) return true;
        else map.add(val);
        
      }
        return false;
    }
}