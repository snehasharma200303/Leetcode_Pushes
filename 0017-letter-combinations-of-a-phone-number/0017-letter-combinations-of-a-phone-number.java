class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        String[] arr={"","","abc","def","ghi","jkl" , "mno","pqrs","tuv","wxyz"};
        return letterList(arr,digits,"");

    }
    public ArrayList<String> letterList(String[] arr,String digits, String curr){
        ArrayList<String> list=new ArrayList<>();
        
        if(digits.length()==0){
            list.add(curr);
            return list;
        }
        int d=digits.charAt(0)-'0';
        String st= arr[d];
        for(char ch: st.toCharArray()){
            ArrayList<String> list2=letterList(arr,digits.substring(1),curr+ch);
            list.addAll(list2);
        }
        
        return list;
    }
}