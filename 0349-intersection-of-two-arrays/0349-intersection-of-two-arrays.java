class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int val:nums1){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int val:nums2){
            if(map.containsKey(val) && map.get(val)!=-1){
                 list.add(val);
                 map.put(val,-1);
            }
             
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}