class Solution {
    public int searchInsert(int[] nums, int target) {
        //Array contains distinct integers
        //If it is not found it must be inserted just before the upper bound index.
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target) {
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else return mid;
        }
        return ans;
    }
}