class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l/2);
            if(((mid == arr.length-1 )||  arr[mid+1]  != arr[mid]) && ( mid==0 || (arr[mid] != arr[mid-1]) )) return arr[mid];
            else if(mid%2 != 0 && (arr[mid-1]==arr[mid])){
                l=mid+1;
            }
            else r=mid-1;
        }
        return 0;
    }
}