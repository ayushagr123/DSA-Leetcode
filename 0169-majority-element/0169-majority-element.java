// {1,3,4,4,4,3,3,4,4,4,4,2}
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int i = 0;
        int count = 0;
        int element = nums[i];
        while(i<n){
            if(nums[i]==element) count++;
            else if(nums[i] != element && count>0) count--;
            if(nums[i] != element && count==0) {
                element = nums[i];
                count++;
            }
            i++;
        }
        return element;
    }
}