class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> set=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int val:nums1){
           set.put(val,set.getOrDefault(val,0)+1);
        }
        for(int val:nums2){
            if(set.containsKey(val)) {
                result.add(val);
                
                if(set.get(val)==1) set.remove(val);
                else set.put(val,set.get(val)-1);
               }
        
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}