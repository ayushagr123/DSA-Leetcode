class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int elem1 = 0;
        int elem2 = 0;
        int count1 = 0;
        int count2 = 0;
        //Apply Moore's voting algorithm for 2 elements
        for(int i = 0;i<nums.length;i++){
            if(count1 == 0 && elem2 != nums[i]){
                elem1 = nums[i];
                count1++;
            }
            else if(count2 == 0 && elem1 != nums[i]){
                elem2 = nums[i];
                count2++;
            }
            else if(nums[i] == elem1) count1++;
            else if(nums[i] == elem2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        //Check actual count of the majority element 
        int freq1 = 0;int freq2 = 0;   
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == elem1) freq1++;
            else if(nums[i] == elem2) freq2++;
        }
        if(freq1>nums.length/3) list.add(elem1);
        if(freq2>nums.length/3) list.add(elem2);
        return list;
    }
}