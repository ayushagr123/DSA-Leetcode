class Solution {
    public void moveZeroes(int[] nums) {
        int currIndex = 0;
        int n = nums.length;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[currIndex];
                nums[currIndex] = nums[i];
                nums[i]= temp;
                currIndex++;
            }
        }
    }
}