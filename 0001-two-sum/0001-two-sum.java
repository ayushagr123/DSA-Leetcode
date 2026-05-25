class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] valueIndx = new int[nums.length][2];
        for(int i = 0;i<nums.length;i++){
            valueIndx[i][0] = nums[i];
            valueIndx[i][1] = i;
        }
        Arrays.sort(valueIndx,(a,b) -> (a[0]-b[0]));
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int left = 0;
        int right = nums.length-1;
        int sum = 0;
        while(left<right){
            sum = valueIndx[left][0] + valueIndx[right][0];
            if(sum>target) right--;
            else if(sum<target) left++;
            else {
                ans[0] = valueIndx[left][1];
                ans[1] = valueIndx[right][1];
                break;
            }
        }
        return ans;
    }
}