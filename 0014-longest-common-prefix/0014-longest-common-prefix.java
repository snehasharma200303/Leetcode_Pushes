class Solution {
    public String longestCommonPrefix(String[] strs) {
        int small=Integer.MAX_VALUE;
        for(String str:strs){
            if(str.length()<small) small=str.length();
        }

        for(int i=0;i<small;i++){
            for(int j=1;j<strs.length;j++){
                String prev=strs[j-1];
                String next=strs[j];
                if(prev.charAt(i)!=next.charAt(i)) return next.substring(0,i);
                
            }
        }
        return strs[0].substring(0,small);
    }
}