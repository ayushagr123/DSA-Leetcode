class Solution {
    public int[][] merge(int[][] intervals) {
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i+1][0]<nums[i][1]){
        //         count++;
        //     }
        // }
        // int[][] interval = new interval[n-count][2];
        // int j =0;
        // for(int i =0;i<n-1;i++){
        //     if(overlap == 0){
        //         interval[j][1] == nums[i][1];
        //         j++;
        //     }
        //     if(nums[i+1][0]<nums[i][1]){
        //         if(overlap==0){
        //             interval[j][0] = nums[i][0];
        //         }
        //         overlap++;
        //     }
        //     else{
        //         interval[j][0] = nums[i][0];
        //         interval[j][1] = nums[i][1];
        //         overlap =0;
        //     }
        //     j++;
        // }

        // Compare first element of the interval with the last element of the previous interval and check if the element present is smaller than the last element of the previous interval, if yes then there this is  a overlapping sub-interval and we have to merge them but we have to check for the next interval as well if it is overlapping or not, hence we will form the new interval unless we get first element of the next interval greater than the last element in the previous interval .



        //Intuition behind the code 
        // Check 2 intervals, if the first element of the 2nd interval is smaller than  
            if (intervals.length <= 1) {
                        return intervals;
                    }

                    // 1. Sort intervals by their start time
                    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

                    // 2. Use a List to easily add merged intervals without knowing the final size
                    List<int[]> merged = new ArrayList<>();

                    // Get the first interval to start comparing
                    int[] currentInterval = intervals[0];
                    merged.add(currentInterval);

                    // 3. Iterate through the rest of the intervals
                    for (int[] interval : intervals) {
                        int currentEnd = currentInterval[1];
                        int nextBegin = interval[0];
                        int nextEnd = interval[1];

                        // If they overlap, merge them by updating the end of currentInterval
                        if (currentEnd >= nextBegin) {
                            currentInterval[1] = Math.max(currentEnd, nextEnd);
                        } else {
                            // No overlap, so move to the next interval and add it to our list
                            currentInterval = interval;
                            merged.add(currentInterval);
                        }
                    }

                    // 4. Convert the dynamic list back to a 2D array to match the return type
                    return merged.toArray(new int[merged.size()][]);
    }
}