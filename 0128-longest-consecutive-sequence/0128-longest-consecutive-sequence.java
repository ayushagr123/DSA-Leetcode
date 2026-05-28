class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> elements = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            elements.add(nums[i]);
        }
        int maxLen = 0;
        for(int num : elements){
            if(!elements.contains(num-1)){
                int count = 1;
                int j = 1;
                while(elements.contains(num+j)){
                    count++;
                    j++;
                }
                maxLen = Math.max(maxLen,count);
            }   
        }
        return maxLen;
    }
}