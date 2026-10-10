class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i<tokens.length){
            if(tokens[i].equals("+")){
                int t1 = st.peek();
                st.pop();
                int t2 = st.peek();
                st.pop();
                int con = t2+t1;
                st.push(con);
            }
            else if(tokens[i].equals("-")){
                int t1 = st.peek();
                st.pop();
                int t2 = st.peek();
                st.pop();
                int con = t2-t1;
                st.push(con);
            }
            else if(tokens[i].equals("*")){
                int t1 = st.peek();
                st.pop();
                int t2 = st.peek();
                st.pop();
                int con = t2*t1;
                st.push(con);
            }
            else if(tokens[i].equals("/")){
                int t1 = st.peek();
                st.pop();
                int t2 = st.peek();
                st.pop();
                int con = t2/t1;
                st.push(con);
            }
            else{
                st.push((Integer.parseInt(tokens[i])));
            }
            i++;
        }
        return st.peek();
    }
}