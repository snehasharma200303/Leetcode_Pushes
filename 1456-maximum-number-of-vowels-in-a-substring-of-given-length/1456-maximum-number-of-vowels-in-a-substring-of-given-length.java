class Solution {
    public int maxVowels(String s, int k) {
        int vowel=0;
        String v="aeiou";
        for(int i=0;i<k;i++){
            if(v.indexOf(s.charAt(i)) != -1)vowel++;
        }
        int maxVowel=vowel;
        for(int i=k;i<s.length();i++){
            if(v.indexOf(s.charAt(i-k)) != -1) vowel--;
             if(v.indexOf(s.charAt(i)) != -1) vowel++;
            maxVowel=Math.max(vowel,maxVowel);
        }
        return maxVowel;
    }
}