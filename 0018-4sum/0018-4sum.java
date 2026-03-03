class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // O(N^3) => TC
        int n= nums.length;
        Set<List<Integer>> outerSet = new HashSet<>();
        Arrays.sort(nums);
        for(int i =0;i<n-3;i++){
            for(int m=i+1;m<n-2;m++){
                int j =m+1;
                int k = n-1;
                while(j<k){
                    long sum = (long) nums[i]+nums[m]+nums[j]+nums[k];
                    if(sum>target) k--;
                    else if(sum<target) j++;
                    else {
                        List<Integer> innerList = Arrays.asList(nums[i],nums[m],nums[j],nums[k]);
                        outerSet.add(innerList);
                        j++;
                        k--;
                    }
                } 
            }
        }
        return new ArrayList<>(outerSet);
    }
}