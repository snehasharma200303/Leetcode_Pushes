class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        int left=s.length()-1,right=s.length();
        StringBuilder sb=new StringBuilder();
        while(left>=0){  
           if(left==0) {
            sb.append(s.substring(left,right));
            break;
            }
            
            if(s.charAt(left)==' '){
            sb.append(s.substring(left+1,right)+" ");
            right=left;
           }
           left--;
        }
        return sb.toString();
    }
}