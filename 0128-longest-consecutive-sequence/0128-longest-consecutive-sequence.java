class Solution {
    public int longestConsecutive(int[] nums) {
        //Store all the elements in a hash map
        if(nums.length == 0) return 0;
        Set<Integer> elements = new HashSet<>();
        for(int elem:nums){
            elements.add(elem);
        }
        int maxLength = Integer.MIN_VALUE;
        for(int i :elements){
            if(!elements.contains(i-1)){
                int length = 1;
                while(elements.contains(i+length)){
                    length++;
                }
                maxLength = Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}