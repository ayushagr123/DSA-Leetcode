class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 1;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(nums[i],max);
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int sum = 0;
            for(int i = 0;i<nums.length;i++){
                sum+=Math.ceil((double)nums[i]/mid);
            }
            if(sum>threshold) low = mid+1;
            else {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}