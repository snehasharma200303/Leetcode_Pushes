class Solution {
    public  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        int k = 0;
        double med = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                arr[k++] = nums2[j++];
            } else
                arr[k++] = nums1[i++];
        }
        while (i != nums1.length)
            arr[k++] = nums1[i++];
        while (j != nums2.length)
            arr[k++] = nums2[j++];
        // System.out.println(Arrays.toString(arr));
        if(arr.length==1) return (double)arr[0];
        if (arr.length % 2 != 0) {
            int len=(arr.length)/2;
            med = (double)arr[len];
        } else {
            int s = arr.length/2;
            // System.out.println(s);
            med = ((double) arr[s] + (double) arr[s - 1])/2;
        }
        return med;
    }
}