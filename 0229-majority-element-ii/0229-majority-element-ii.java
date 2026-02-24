class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        List<Integer> list = new ArrayList<>();
        int i =0;
        int j = i+1;
        int element=nums[i];
        if(nums.length>1){
            while(i<nums.length && j<nums.length){
                element = nums[i];
                if(nums[j]==element) count++;
                else if(nums[j]!=element){
                    if(count>nums.length/3){
                        list.add(element);
                    }
                    i=j;
                    count = 1;
                }
                j++;
            }
            if(count>nums.length/3){
                list.add(nums[i]);
            }
        }
        else{
            list.add(nums[0]);
        }
        return list;

    }
}