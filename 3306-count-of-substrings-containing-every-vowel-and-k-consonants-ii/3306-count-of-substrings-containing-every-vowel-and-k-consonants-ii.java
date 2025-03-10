class Solution {
    public long countOfSubstrings(String word, int k) {
        int n=word.length()-(5+k);
        int count=0;
        for(int i=0;i<=n;i++){
            int a=-1,e=-1,ii=-1,o=-1,u=-1,c=0;
            for(int j=i;j<(i+5+k);j++){
            if(word.charAt(j)=='a') a++;
            else if(word.charAt(j)=='e') e++;
            else if(word.charAt(j)=='i') ii++;
            else if(word.charAt(j)=='o') o++;
            else if(word.charAt(j)=='u') u++;
            else c++;
            }
            if(a!=-1 && e!=-1 && ii!= -1 && o!=-1 && u!=-1 && c<=k) count++;
        }
        return count;
    }
}