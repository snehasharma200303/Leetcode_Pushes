class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS=s.length();
        int lenT=t.length();
        int l1=0,l2=0;
        if(lenS!=lenT) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        while(l1<lenS && l2<lenT){
            char ch1=s.charAt(l1);
            char ch2=t.charAt(l2);
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            map.put(ch2,map.getOrDefault(ch2,0)-1);
            l2++;
            l1++;
        }
        for(int val:map.values()){
            if(val!=0) return false;
        }
        return true;
    }
}