class Solution {
    public int removeDuplicates(int[] nums) {
        int currElement = nums[0];
        int currIndex = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=currElement){
                nums[currIndex+1]= nums[i];
                currElement = nums[i];
                currIndex++;
            }
        }
        return currIndex+1;
    }
}