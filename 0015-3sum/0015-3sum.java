class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Fix one of the element and the problem becomes 2sum
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k){
                List<Integer> inner = new ArrayList<>();
                int currSum = (nums[j]+nums[k]);
                if(currSum>-nums[i]) k--;
                else if(currSum<-nums[i]) j++;
                else {
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(nums[k]);
                    ans.add(inner);
                    j++;
                    k--;
                    while(j<k && nums[j-1] == nums[j]){
                        j++;
                    }
                    while(j<k && nums[k+1] == nums[k]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}