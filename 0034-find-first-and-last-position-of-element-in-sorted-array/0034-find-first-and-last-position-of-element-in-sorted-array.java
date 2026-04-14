class Solution {
    //Calculate floor 
    public int floor(int[] nums,int target){
       int low = 0;
       int high = nums.length-1;
       int first = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<=target){
                first = mid;
                low = mid+1;                
            }
            else high = mid-1;
        }
        return first;   
    }
    //Calculate ceil
    public int ceil(int[] nums,int target){
       int low = 0;
       int high = nums.length-1;
       int last = -1;
       
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                last = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return last;

    }
    public int[] searchRange(int[] nums, int target) {
         Solution obj = new Solution();
         int first = obj.floor(nums,target);
         int last = obj.ceil(nums,target);
         if(first==-1 || last == -1 || nums[first]!=nums[last]) return new int[]{-1,-1};
         else return new int[]{last,first};
    }
}