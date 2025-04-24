class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int[] answer=new int[n1];
        for(int i=0;i<n1;i++){
            boolean check=true;
            int sameElInd=0;
            while((sameElInd<n2) && nums1[i] != nums2[sameElInd]) sameElInd++;
            for(int k=sameElInd+1;k<n2;k++){
                if(nums2[sameElInd]<nums2[k]){
                    check=false;
                    // nums2[k]=-1;
                   answer[i]=nums2[k];
                   break;  
                }
            }
            if(check) answer[i]=-1;
        }
        return answer;
    }
}