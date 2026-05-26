class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] resArr = new int[n];
        int even = 0;
        int odd = 1;
        for(int i =0;i<n;i++){
            if(nums[i]>=0) {
                resArr[even] = nums[i];
                even+=2;
            }
            else{
                resArr[odd]=nums[i];
                odd+=2;
            }
        }
        return resArr;
    }
}