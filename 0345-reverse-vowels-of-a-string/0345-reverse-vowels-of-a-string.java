class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
    int p=0,q=s.length()-1;
    while(p<=q){
        char chP=s.charAt(p);
        char chQ=s.charAt(q);
        if(String.valueOf(chP).matches("[aeiouAEIOU]") && String.valueOf(chQ).matches("[aeiouAEIOU]")) {
            sb.setCharAt(p,chQ);
            sb.setCharAt(q,chP);
            p++;q--;
        }
        else if(String.valueOf(chP).matches("[aeiouAEIOU]") ) q--; 
        else p++;
    }
    return sb.toString();
        }
}