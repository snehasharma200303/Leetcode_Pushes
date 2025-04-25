class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        int l=0,r=0;
      
        for(int i=0;i<s.length();i++){
              boolean flag=true;
             l=i;r=i;
            while(l>= 0 && r<s.length()){
                char ch1=s.charAt(l);
                char ch2=s.charAt(r);
                if(ch1 != ch2){
                    flag=false;
                   break; 
                } 
                else{
                    l--;
                    r++;
                }
            }
            if(flag){
                if(ans.length()<(r-l+1)){
                    ans=s.substring(l+1,r);
                    }
            }
        }
        return ans;
    }
}