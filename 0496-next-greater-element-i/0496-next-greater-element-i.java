class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]) st.pop();
            if(st.isEmpty()) map.put(nums2[i],-1);
            else map.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }
        int[] ans=new int[nums1.length];
        for(int k=0;k<nums1.length;k++){
            ans[k]=map.get(nums1[k]);
        }
        return ans;
    }
}