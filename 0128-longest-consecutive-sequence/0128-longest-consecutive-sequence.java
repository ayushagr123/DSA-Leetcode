class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        int n=nums.length;
        int length = 1;
        int maxLength = 1;
        if(n>0){
            for(int i=0;i<n;i++){
                elements.add(nums[i]);
            }
            for(int i:elements){
                if(elements.contains(i-1)) continue;
                else{
                    length =1;
                    while(elements.contains(i+1)){
                        length++;
                        i++;
                    }
                    maxLength=Math.max(maxLength,length);
                }
            }
            return maxLength;
        }
        else return 0;

    }
}