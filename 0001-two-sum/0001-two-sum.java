class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff = 0;
        int i;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] indx = new int[2];
        for(i=0;i<nums.length;i++){
            diff = target-nums[i];
            if(map.containsKey(diff)){
                indx[0] = map.get(diff);
                break;
            }
            else {
                map.put(nums[i],i);
            }
        }
        indx[1]= i;
        return indx; 
    }
}