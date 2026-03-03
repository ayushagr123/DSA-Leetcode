class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> outerSet = new HashSet<>();
        Arrays.sort(nums);
        //Can be convertd into n 2sum problem
        int sum ;
        for(int i =0;i<n;i++){
            int j =i+1;
            int k = n-1;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                if(sum>0) k--;
                else if(sum<0) j++;
                else {
                    List<Integer> innerList = Arrays.asList(nums[i],nums[j],nums[k]);
                    Collections.sort(innerList);
                    outerSet.add(innerList);
                    sum = 0;
                    j++;
                    k--;
                }
            } 
        }
        return new ArrayList<>(outerSet);
    }
}