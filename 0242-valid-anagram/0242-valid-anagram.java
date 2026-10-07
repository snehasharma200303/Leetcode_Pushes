class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] alpha=new int[26];
        for(char ch:s.toCharArray()){
            alpha[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            alpha[ch-'a']--;
        }
        for(int i:alpha){
            if(i!=0) return false;
        }
        return true;
    }
}