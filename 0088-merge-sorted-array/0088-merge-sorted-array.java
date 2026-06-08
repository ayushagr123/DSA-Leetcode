class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Add the elements of nums2 in the last n places in nums1
        //Sort nums1
        for(int i = 0 ;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}