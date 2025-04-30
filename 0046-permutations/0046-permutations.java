class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        per(nums,0,list);
        return list;
    }
    public void per(int[] nums, int idx,List<List<Integer>> list){
        if(idx==nums.length){
            List<Integer> t=new ArrayList<>();
            for(int n:nums) t.add(n);
            list.add(t);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            per(nums,idx+1,list);
            swap(nums,idx,i);
        }
    }
    public void swap(int[] nums, int l, int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}