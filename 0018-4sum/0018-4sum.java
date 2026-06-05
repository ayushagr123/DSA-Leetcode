class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //Same 3 sum approach first fix the first element, then second element and use 2 pointer to find the sum
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        //Fix the first element
        for(int l = 0;l<nums.length;l++){
            if(l>0 && nums[l] == nums[l-1]) continue;
            //Fix second element
            for(int k = l+1;k<nums.length;k++){
                if(k>l+1 && nums[k] == nums[k-1]) continue;
                int i = k+1;
                int j = nums.length-1;
                while(i<j){
                    long sum =(long) nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        outer.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        i++;
                        j--;
                        while(i<j && nums[i]==nums[i-1]) i++;
                        while(i<j && nums[j] == nums[j+1]) j--;
                    }
                    else if(sum<target) i++;
                    else j--;
                }
            }
        }
        return outer;
    }
}