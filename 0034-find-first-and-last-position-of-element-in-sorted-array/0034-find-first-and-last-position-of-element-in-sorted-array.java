class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] occurence = new int[2];
        int first = -1;
        int last = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                last = mid;
                low = mid+1;
            }
        }
        occurence[1] = last;

        low = 0;
        high = last;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                first = mid;
                high = mid-1;
            }
        }
        occurence[0] = first;
        return occurence;

    }
}