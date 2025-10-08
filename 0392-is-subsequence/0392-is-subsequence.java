class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch)) return false;
            else{
                if(prev==-1) prev=t.indexOf(ch);
                else{
                   if(t.indexOf(ch,prev+1)<=prev) return false;
                   else{
                    prev=t.indexOf(ch);
                   }
                }
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)<=0) map.remove(ch);
            }
        }
        return true;
    }
}