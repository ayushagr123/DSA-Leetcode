class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Brute force approach
        // for(int i = 0;i<n;i++){
        //     nums1[m+i] = nums2[i];
        // }     
        // Arrays.sort(nums1);
        int ind1 = m-1;
        int ind2 = n-1;
        int ind3 = m+n-1;
        while(ind1>=0 && ind2>=0){
            if(nums1[ind1]>=nums2[ind2]){
                nums1[ind3] = nums1[ind1];
                ind1--;
            } 
            else if(nums2[ind2]>nums1[ind1]){
                nums1[ind3] = nums2[ind2];
                ind2--;
            } 
            ind3--;
        }
        while (ind2 >= 0) {
            nums1[ind3] = nums2[ind2];
            ind2--;
            ind3--;
        }
    }
}