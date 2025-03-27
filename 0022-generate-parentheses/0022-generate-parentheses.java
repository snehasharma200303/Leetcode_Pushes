class Solution {
    public List<String> generateParenthesis(int n) {
        return genPar(n,0,0,"");
    }
    public ArrayList<String> genPar(int n, int open, int close, String currStr){
        ArrayList<String> list=new ArrayList<>();
        if(open==n && close==n){
            list.add(currStr);
            return list;
        }
        if(open<n){
            list.addAll(genPar(n,open+1,close,currStr+"("));
        }
        if(open>close){
           list.addAll(genPar(n,open,close+1,currStr+")"));
        }
        return list;
    }
}