class Solution {
    public String longestCommonPrefix(String[] strs) {
        int small=Integer.MAX_VALUE;;
        for(String st:strs){
            if(st.length()<small) small=st.length();
        }
        // System.out.println(small);
        for(int i=0;i<small;i++){
            for(int j=1;j<strs.length;j++){
                String s=strs[j];
                String s2=strs[j-1];
                if(s.charAt(i) != s2.charAt(i)) return s.substring(0,i);
            }
        }
        return strs[0].substring(0,small);
    }
}