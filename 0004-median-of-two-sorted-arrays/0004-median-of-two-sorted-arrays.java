class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        int left_half = (n1+n2+1)/2;
        int low = 0;
        int high = n1;
        while(low<=high){
            int mid = (low+high)/2;
            int cut1 = mid;
            int cut2 = left_half-cut1;
            int l1,l2,r1,r2;
            if(cut1 == 0)  l1 = Integer.MIN_VALUE;  
            else  l1 = nums1[cut1-1];

            if(cut2 == 0)  l2 = Integer.MIN_VALUE;
            else  l2 = nums2[cut2-1];

            if(cut1 == n1)  r1 = Integer.MAX_VALUE;
            else  r1 = nums1[cut1];

            if(cut2 == n2)  r2 = Integer.MAX_VALUE;
            else  r2 = nums2[cut2];
            
            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0) return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                else return Math.max(l1,l2);
            }
            else if(l1>r2) high = mid-1;
            else low = mid+1; 
        }
        return -1;
    }
}