class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set <Integer> set = new HashSet<>();
        int n = digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(digits[i] == 0) continue;
                    if(digits[k] % 2!=0) continue;
                    int numbers = digits[i]*100 + digits[j]*10 + digits[k];
                    set.add(numbers);
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}