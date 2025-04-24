class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=n2-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]) st.pop();
            if(st.isEmpty()) map.put(nums2[i],-1);
            else map.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }
        int n1=nums1.length;
        int[] ans=new int[n1];
        for(int k=0;k<n1;k++){
            ans[k]=map.get(nums1[k]);
        }
        return ans;
    }
}