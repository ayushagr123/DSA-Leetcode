class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int xor=0;
        for(int number:nums){
            xor = number^xor;
        }
        return xor;
    }
}