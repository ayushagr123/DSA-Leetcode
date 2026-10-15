class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] sequence = new int[n][2];
        for(int i = 0;i<n;i++){
            sequence[i][0] = position[i];
            sequence[i][1] = speed[i];
        }
        Arrays.sort(sequence , (a,b) -> Integer.compare(a[0],b[0]));
        double[] time = new double[n];
        for(int i = 0;i<n;i++){
            time[i] = (double)(target - sequence[i][0])/(double) sequence[i][1];
        }
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(i>=0 && !st.isEmpty() && time[i]<=time[st.peek()]) {
                i--;
            }
            if(i>=0) st.push(i);
        }
        return st.size();
    }
}