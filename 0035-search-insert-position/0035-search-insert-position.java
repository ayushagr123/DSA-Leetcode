class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                ans = mid;
                high = mid-1;
            }
            else
            low = mid+1;
        }
        if(ans>0){
            if(nums[ans-1] == target) return ans-1;
            else return ans;
        }
        else return ans;
        
    }
}