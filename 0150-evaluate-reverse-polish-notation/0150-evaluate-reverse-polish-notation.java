class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens) {
            if(s.equals("+")) {
                st.push(st.pop() + st.pop());
            } 
            
            else if(s.equals("-")) {
                int sec = st.pop();
                int first = st.pop();
                st.push(first - sec);
            } 
            
            else if(s.equals("*")) {
                st.push(st.pop() * st.pop());
            } 
            
            else if(s.equals("/")) {
                int sec = st.pop();
                int first = st.pop();
                st.push(first / sec);
            }
            
            else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }
}