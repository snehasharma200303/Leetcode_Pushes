class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l=0,r=s.length()-1;
        while(l<=r){
            char l1=s.charAt(l);
            char r1=s.charAt(r);
            if(l1 != r1) return false;
            l++;r--;
        }
        return true;
    }
}