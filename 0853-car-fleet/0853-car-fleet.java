class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] sequence = new int[n][2];
        for(int i = 0;i<n;i++){
            sequence[i][0] = position[i];
            sequence[i][1] = speed[i];
        }
        Arrays.sort(sequence , (a,b) -> Integer.compare(a[0],b[0]));
        int fleet = 0;
        double currTime;
        double prevFleetTime = 0;
        for(int i = n-1;i>=0;i--){
            currTime = (double)(target - sequence[i][0])/(double) sequence[i][1];
            if(currTime>prevFleetTime){
                fleet++;
                prevFleetTime = currTime;
            }
        }
        return fleet;
    }
}