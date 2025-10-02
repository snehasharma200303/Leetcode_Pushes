class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        String vowel="aeiouAEIOU";
    int p=0,q=s.length()-1;
    while(p<=q){
        char chP=s.charAt(p);
        char chQ=s.charAt(q);
        if(vowel.indexOf(chP) != -1 && vowel.indexOf(chQ) != -1) {
            sb.setCharAt(p,chQ);
            sb.setCharAt(q,chP);
            p++;q--;
        }
        else if(vowel.indexOf(chP) != -1) q--; 
        else p++;
    }
    return sb.toString();
        }
}