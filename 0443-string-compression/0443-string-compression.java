class Solution {
    public int compress(char[] chars) {
        int p=0;
        int n=chars.length;
        int count=1;
        if(n==1) return 1;
       for(int q=0;q<n;q++){ 
        if( q!=n-1 && chars[q]==chars[q+1]) count++;
        else if( (q==n-1) || chars[q] != chars[q+1]) {      
            chars[p]=chars[q];         
            if(count>1){
                char[] num=String.valueOf(count).toCharArray();
                
                for(char val: num){                  
                    chars[p+1]=val;
                p++;
                }          
            }
            p++;
           count=1;  
        }
    }
    // if(count>1){ 
    //         chars[p]=chars[n-1];
    //     chars[p+1]=(char)(count+'0');
    //     p+=2;   
    //     }
    //     else{
    //          chars[p]=chars[n-1];
    //          p++;
    //     }
    return p;
}
}