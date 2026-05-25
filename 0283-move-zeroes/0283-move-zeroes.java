class Solution {
    public void moveZeroes(int[] nums) {
        int currIndex = 0;
        int n = nums.length;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[currIndex] = nums[i];
                currIndex++;
            }
        }
        if(currIndex<n){
            for(int i = currIndex;i<n;i++){
                nums[i] =  0;
            }
        }
    }
}