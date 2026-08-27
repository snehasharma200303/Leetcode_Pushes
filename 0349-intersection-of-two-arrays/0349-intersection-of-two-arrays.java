class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int val:nums1){
            map.add(val);
        }
        for(int val:nums2){
            if(map.contains(val)){
                 list.add(val);
                 map.remove(val);
            }
             
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}