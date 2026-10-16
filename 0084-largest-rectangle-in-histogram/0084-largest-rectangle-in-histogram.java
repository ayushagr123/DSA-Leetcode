class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = Integer.MIN_VALUE;
        int elem, nse, pse;
        for(int i = 0;i<n;i++){
            while(!st.empty() && heights[st.peek()] > heights[i]){
                elem = heights[st.peek()];
                st.pop();
                nse = i;
                pse = st.isEmpty()?-1:st.peek();
                maxArea = Math.max(elem * (nse-pse-1), maxArea);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nse = n;
            elem = heights[st.pop()];
            pse = st.isEmpty() ? -1:st.peek();
            maxArea = Math.max(maxArea, (nse-pse-1)*elem);
        }
        return maxArea;
    }
}