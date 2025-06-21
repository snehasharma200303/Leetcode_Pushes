class Solution {
    public String modifyString(String s) {
        char[] alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuilder sb=new StringBuilder(s);
        int n=0;
        for(int i=0;i<s.length();i++){
            n=0;
            char ch=sb.charAt(i);
            if(ch=='?'){
                while(alpha[n] == ch || (i!= 0 && alpha[n]==sb.charAt(i-1)) || (i==sb.length()-1 && alpha[n]==sb.charAt(i+1))){
                    n++;
                }
                sb.setCharAt(i,alpha[n]);
            }
        }
        return sb.toString();
    }
}