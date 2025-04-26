class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<String> arr=new ArrayList<>();
        List<List<String>> list=new ArrayList<>();
        part(s,0,arr,list);
        return list;
    }
    public void part(String s, int idx ,ArrayList<String> arr, List<List<String>> list){
        if(idx==s.length()) {
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String pref=s.substring(idx,i+1);
            if(isvalid(pref)){
                arr.add(pref);
            part(s,i+1,arr,list);
            arr.remove(arr.size()-1); 
            } 
        }
    }
    public boolean isvalid(String s){
        StringBuilder ss=new StringBuilder(s);
        return ss.reverse().toString().equals(s);
    }
}