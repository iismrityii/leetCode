class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == '(') {
                st.push(0);
            }
            
            else {
                int val = st.pop();
                int score;

                if(val == 0) {
                    score = 1;
                }
                else {
                    score = 2 * val;
                }

                st.push(st.pop() + score);
            }
        }

        return st.pop();
    }
}