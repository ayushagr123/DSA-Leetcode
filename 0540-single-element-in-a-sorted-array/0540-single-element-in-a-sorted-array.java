class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int low = 0;
        int high = nums.length-1;
        while((high-low)>2){
            int mid = (low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid%2 == 0){
                if(nums[mid]!=nums[mid+1]) high = mid;
                else low = mid;
            } 
            else{
                if(nums[mid]!=nums[mid+1]) low = mid;
                else high = mid-1;
            }
        }
        if(nums[low]==nums[low+1]) return nums[high];
        else return nums[low];
    }
}