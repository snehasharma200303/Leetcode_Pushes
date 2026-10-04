class Solution {
    public int firstUniqChar(String s) {
     int[] alph=new int[26];
     for(char ch:s.toCharArray()){
        alph[ch-'a']++;
     }   
     for(int i=0;i<s.length();i++) {
            if(alph[s.charAt(i)-'a']==1) return i;
     }
     return -1;
    }
}