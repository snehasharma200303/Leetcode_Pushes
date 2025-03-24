class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] a= {-1,-1};

        int st=0,end=arr.length-1;
       while(st<=end){
        int mid=st+(end-st);
        if(arr[mid]==target){
           a[0]=mid;
            end=mid-1;
        }
        else if(arr[mid]<target){
            st=mid+1;
        }
        else{
            end=mid-1;
        }
       }
       st=0;end=arr.length-1;
        while(st<=end){
        int mid=st+(end-st);
        if(arr[mid]==target){
           a[1]=mid;
            st=mid+1;
        }
        else if(arr[mid]<target){
            st=mid+1;
        }
        else{
            end=mid-1;
        }
       }
    return a;
    }
}