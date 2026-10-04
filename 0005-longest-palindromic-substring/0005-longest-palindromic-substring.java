class Solution {
    public String longestPalindrome(String s) {
       String ans="";
       for(int i=0;i<s.length();i++){
        String odd=lp(i,i,s);
        String even=lp(i,i+1,s);
        if(odd.length()>ans.length()) ans=odd;
        if(even.length()>ans.length()) ans=even;
       }
       return ans;
    }
    public String lp(int l, int r, String s){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;r++;
        }
        return s.substring(l+1,r);
    }
}