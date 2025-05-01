class Solution {
    public int trap(int[] height) {
        Stack<Integer> st=new Stack<>();
        int n=height.length;
        int waterTrap=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[i] > height[st.peek()]) {
             int m=st.pop();
             if(st.isEmpty()) break;
            int left=st.peek();
            int width=i-left-1;
            int boundweig=Math.min(height[i],height[left])-height[m];
            waterTrap+=width*boundweig;
            }
            st.push(i);
        }
        return waterTrap;
    }
}