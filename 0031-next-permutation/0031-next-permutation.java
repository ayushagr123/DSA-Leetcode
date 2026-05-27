class Solution {
    public void nextPermutation(int[] nums) {
        int j= nums.length-1;
        int min = 0;
        int minIndex = 0;
        int i = nums.length-1;
        int temp = 0;

        //Finds the breakpoint
        while(j>0 && nums[j]<=nums[j-1]){
            j--;
        }

        //Finds the minimum number greater than the breakpoint to the right 
        //of it .
        if(j>0){
            while(nums[i]<=nums[j-1]){
                i--;
            }
            //Swaps the breakpoint with the minimum number
            int temp1 = nums[j-1];
            nums[j-1] = nums[i];
            nums[i] = temp1;
            
        }
        //Reverse rest of the array
        int start = j;
        int end = nums.length-1;
        while(start<end){
            int temp2 = nums[start];
            nums[start] = nums[end];
            nums[end] = temp2;
            start++;
            end--;
        }
    }
}