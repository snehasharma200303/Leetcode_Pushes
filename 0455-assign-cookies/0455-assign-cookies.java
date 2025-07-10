class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=s.length-1;
        int child=0;
        for(int i=g.length-1;i>=0;i--){
            if(j<0) return child;
            if(s[j]>=g[i]){
                child++;
                j--;
            }
        }
        return child;
    }
}