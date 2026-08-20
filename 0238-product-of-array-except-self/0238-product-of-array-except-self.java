class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 1, right = 1;
        answer[0] = 1;
        for(int i = 1;i<nums.length;i++){
            left *= nums[i-1];
            answer[i] = left;
        }
        for(int i = nums.length-2;i>=0;i--){
            right *= nums[i+1];
            answer[i] *= right;
        }
        return answer;
    }
}