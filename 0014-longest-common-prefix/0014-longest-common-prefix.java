class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        String small=strs[0];
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<small.length()) small=strs[i];
        }

        for(int i=0;i<small.length();i++){
            char ch=small.charAt(i);
            int check=0;
            for(int j=0;j<strs.length;j++){
                String curr=strs[j];
                        System.out.println(curr);
                char chCurr=curr.charAt(i);
                if(ch==chCurr) {check++;}
                
            }
        if(check==strs.length){
            s.append(ch);
        }
        else break;
                }
        return s.toString();
    }
}