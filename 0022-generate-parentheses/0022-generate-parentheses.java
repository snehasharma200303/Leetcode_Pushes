class Solution {
    public List<String> generateParenthesis(int n) {
        return par(n,0,0,"",0);
    }
    public ArrayList<String> par(int n, int o, int c, String curr,int total){
        ArrayList<String> list=new ArrayList<>();
        if(o==n && c==n) {
            list.add(curr);
            return list;
        }
        if(o<n){
        list.addAll(par(n,o+1,c,curr+"(",total+1));
        }
         if(o>c){
        list.addAll(par(n,o,c+1,curr+")",total+1));
        }
        return list;
    }
}