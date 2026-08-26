class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output=new int[2];
        int val=0;
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        val=nums[i];
        if(map.containsKey(target-val)){
            output[0]=i;
            output[1]=map.get(target-val);
            break;
        }
        map.put(val,i);
      }
        return output;
    }
}