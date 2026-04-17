class Solution {
    public int search(int[] nums, int target) {
        //Simple binary search can't be applied because array is not sorted 
        //If we try to sort the given array that would take O(nlogn)
        //Hence what we can do is => we can divide the array in two parts since both of the
        //parts are sorted we can apply binary search on it.
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>=nums[start]){  //We are in left sorted half
                if(nums[start]<=target && target<nums[mid]) end = mid-1; //Target is in range(start..mid)
                else  start = mid+1;
            } 
            else if(nums[mid]<nums[start]){ //We are in right sorted half
                if(nums[mid]<target && target<=nums[end]) start = mid+1;
                else end = mid-1;    
            }    
        }
        return -1;
    }
}

