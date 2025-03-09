class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int count=0;  
        for(int i=0;i<n;i++){
            int valid=1;
            for(int j=1;j<k;j++){
            int prev=(i+j-1)%n;
            int newN=(i+j)%n;
           
            if(colors[prev] == colors[newN])  {
                valid=0;
                break;
            }
        }   
        if(valid==1) count++;
        }                    
        return count;                      
    }
}