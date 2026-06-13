class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 1;
        for(int i = 0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        int low = 1;
        int high = max;
        int ans = max;
        while(low<=high){
            int mid = (low+high)/2;
            long currHours = 0;
            for(int i = 0;i<piles.length;i++){
                currHours += Math.ceil( (double) piles[i]/mid); // or currHours += (piles[i] + mid - 1) / mid;
            }
            if(currHours <= h){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}