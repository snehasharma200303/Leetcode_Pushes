class Solution {
    public boolean checkPowersOfThree(int n) {
      ArrayList<Integer> list=new ArrayList<>();
      int ans=1;
      while(ans<n){
        list.add(ans);
        ans=ans*3;
      }
      if(ans==n) list.add(ans);
    ans=0;
    for(int i=list.size()-1;i>=0;i--){
        int c=list.get(i);
        if((ans+c)==n) return true;
        else if((ans+c)>n) continue;
        else {
            ans=ans+c;
        }
    }
    return false;
    }
}