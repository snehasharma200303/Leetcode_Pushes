class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int left=arr.length-1;left>=0;left--) { 
           sb.append(arr[left]);
           if(left>0) sb.append(" ");
        }
        return sb.toString();
    }
}