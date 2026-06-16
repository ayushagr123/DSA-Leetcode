class Solution {
    public int splitArray(int[] nums, int m) {
        if(m>nums.length) return -1;
        int low = 0;
        int high = 0;
        for(int i = 0;i<nums.length;i++){
            low = Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int students = isPossible(nums,mid);
            if(students>m){
                low = mid+1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
            
        }
        return ans;
    }

    public static int isPossible(int[] nums,int barrier){
        int allocatedStudent = 1 ; int pages= 0;
        for(int i = 0;i<nums.length;i++){
            if((nums[i]+pages)>barrier) {
                allocatedStudent++;
                pages = nums[i];
            }
            else{
                pages+=nums[i];
            }
        }
        return allocatedStudent;
    }
    
}