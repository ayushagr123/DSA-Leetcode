class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        for(int k = 0;k<nums.length;k++){
            if(k>0 && nums[k] == nums[k-1]) continue;
            int i = k+1;
            int j = nums.length-1;
            while(i<j){
                int sum = nums[i] + nums[j];
                if(sum == -nums[k]){
                    List<Integer> inner = new ArrayList<>();
                    Collections.addAll(inner,nums[i],nums[j],nums[k]);
                    outer.add(inner);
                    i++;
                    j--;
                    while(i<j && nums[i] == nums[i-1]) i++;
                    while(i<j && nums[j] == nums[j+1]) j--; 
                }
                else if(sum<-nums[k]) i++;
                else j--;
            }
        }
        return outer;
    }
}