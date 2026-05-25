class Solution {
    public int singleNumber(int[] nums) {
        //XOR operation 
        //xor of a number with itself gives 0 as result.
        //and xor of a number with 0 gives number itself
        int xor = 0;
        for(int i =0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}