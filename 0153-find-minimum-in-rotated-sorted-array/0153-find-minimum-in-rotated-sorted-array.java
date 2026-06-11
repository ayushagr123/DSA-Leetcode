class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid]>=nums[low]){ //Left sorted half
                if(nums[mid]>nums[high])
                low = mid+1;
                else return nums[low];
            }
            else{ //Right sorted half
                high = mid;
            }
        }
        return nums[mid];
    }
}