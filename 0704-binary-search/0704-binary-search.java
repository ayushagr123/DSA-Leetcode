class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return divide(nums,0,n-1,target);
    }
    public int divide(int[] nums, int start,int end,int target){
        int mid = start + (end-start)/2;
        if(start>end) return -1;
        else if(target>nums[mid]){
            start = mid+1;
            return divide(nums,start,end,target);
        }
        else if(target<nums[mid]){
            end = mid-1;
            return divide(nums,start,end,target);
        }
        else  return mid;
    }
}