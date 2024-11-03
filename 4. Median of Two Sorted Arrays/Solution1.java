class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] mergedArray = new int [nums1.length + nums2.length];
        int i=0,j=0,k=0;
        double Median=0;

        while(i < nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                mergedArray[k++]=nums1[i++];
            }
            else {
                mergedArray[k++]=nums2[j++];
            }
        }
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        if(mergedArray.length%2==0){
            Median= (double) (mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1]) /2;
        }
        else
            Median = mergedArray[mergedArray.length/2];
        return Median;
    }
}