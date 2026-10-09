class MinStack {
    Stack<Long> st;
    long min = Integer.MIN_VALUE;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push((long)value);
            min = value;
        }
        else{
            if(value<min){
                st.push(2L*value - min);
                min = value;
            }
            else st.push((long)value);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return ;
        else{
            long x = st.peek();
            st.pop();
            if(x<min){
            min = 2*min - x;
            }
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long x = st.peek();
        if(x<min) return (int)min;
        else return (int)x;
    }
    
    public int getMin() {
        if(st.isEmpty()) return -1;
        else return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */