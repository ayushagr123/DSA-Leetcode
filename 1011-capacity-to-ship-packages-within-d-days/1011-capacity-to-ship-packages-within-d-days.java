class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //Max capacity => sum of all wieghts 
        //Minimum capacity = 1
        int maxCap = 0; int minCap = 1;
        for(int i = 0;i<weights.length;i++){
            maxCap+=weights[i];
            minCap = Math.max(minCap,weights[i]);
        }
        int low = minCap;
        int high = maxCap;
        int ans = maxCap;
        while(low<=high){
            int mid = (low+high)/2;  //mid is capacity
            //Calculate number of days required for a particular capacity
            int sum = 0; int day = 0;
            for(int i = 0;i<weights.length;i++){
                sum+=weights[i];
                if(sum==mid){
                    day++;
                    sum = 0;
                }
                else if(sum>mid){
                    day++;
                    sum = 0;
                    i--;
                }
            }
            if(sum>0) day++;
            if(day>days) low = mid+1;
            else {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}