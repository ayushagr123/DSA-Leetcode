class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = 1;
        }
        int left=1;
        int right=1;
        for(int i=0;i<n;i++){
            answer[i]*=left;
            left*=nums[i];
            answer[n-1-i]*=right;
            right*=nums[n-1-i];
        }
        return answer;
    }
}