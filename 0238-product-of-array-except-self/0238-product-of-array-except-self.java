class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        int[] answer = new int[n];
        int left=1;
        int right=1;
        for(int i=0;i<nums.length;i++){
            leftArr[i] = left;
            left*=nums[i];
            rightArr[n-1-i]=right;
            right*=nums[n-1-i];
        }
        for(int i=0;i<nums.length;i++){
            answer[i] = (leftArr[i]*rightArr[i]);
        }
        return answer;
    }
}