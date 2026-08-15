class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Traverse through the array and store the elements in a hashmap along with their frequency if at any point same element is found again return false
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            if(mpp.containsKey(nums[i])) return true;
            else mpp.put(nums[i],0);
        }
        return false;
    }
}