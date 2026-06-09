class Solution {
    public int search(int[] nums, int target) {
        return divide(nums,target,0,nums.length-1);
    }
    public int divide(int[] nums, int target, int start ,int end){
        if(start>end) return -1;
        int mid = (start+end)/2;
        if(nums[mid]==target) return mid;
        else if(target>nums[mid]) return divide(nums,target,mid+1,end);
        else return divide(nums,target,start,mid-1);
    }
}