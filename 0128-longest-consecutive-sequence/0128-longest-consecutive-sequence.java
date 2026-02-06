// Bettter approach => 
// 1) First sort the array
// 2) Then traverse through the entire array and look for longest consceutive sequence and return its length.
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int length=1;
        int maxLength=1;
        if(nums.length>0){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                length++;
                maxLength = Math.max(length,maxLength);
            }
            else if(nums[i+1]-nums[i]==0){
                continue;
            }
            else length=1;
        }
        return maxLength;
        }
        else return 0;

    }
}