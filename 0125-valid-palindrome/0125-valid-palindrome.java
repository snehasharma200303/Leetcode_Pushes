class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)) ans+=ch;
        }
        int l=0,r=ans.length()-1;
        ans=ans.toLowerCase();
        while(l<=r){
            if(ans.charAt(l) != ans.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}