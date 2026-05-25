class Solution {
    public static void rotate(int[] nums, int k) {
        //Brute force approach => use another array to store first k elements.
        //Now add those elements in the array at the last.

        //Optimal approach => Reverse elements upto kth index
        // Now reverse the remaining elements 
        //Final Step => Reverse the entire array.
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1-k);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        
        
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }  
}