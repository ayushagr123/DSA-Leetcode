class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Brute force approach
        for(int i = 0;i<n;i++){
            nums1[m+i] = nums2[i];
        }     
        Arrays.sort(nums1);
    }
}