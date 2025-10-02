class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        int right=s.length();
        StringBuilder sb=new StringBuilder();
        for(int left=s.length()-1;left>=0;left--) { 
           if(left==0) {
            sb.append(s.substring(left,right));
            break;
            }

            if(s.charAt(left)==' '){
            sb.append(s.substring(left+1,right)+" ");
            right=left;
           }
        }
        return sb.toString();
    }
}