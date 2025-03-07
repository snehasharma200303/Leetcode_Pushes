class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ansA = {-1, -1};
        ArrayList<Integer> list=new ArrayList<>();
        while(left<=right){
            if(isPrime(left)) list.add(left);
            left++;
        }
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            int diff=(list.get(i)-list.get(i-1));
            if(diff<minDiff) {
                minDiff=diff;
                ansA[0]=list.get(i-1);
                ansA[1]=list.get(i);
            }
            else if(diff==minDiff && ansA[0]>list.get(i-1)){
                ansA[0]=list.get(i-1);
                ansA[1]=list.get(i);
            }

        }
       return ansA; 
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
