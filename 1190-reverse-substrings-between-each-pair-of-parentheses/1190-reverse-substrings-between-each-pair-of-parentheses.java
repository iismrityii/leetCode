class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(sb);
                sb = new StringBuilder();

            } else if (ch == ')') {
                sb.reverse();
                StringBuilder prev = st.pop();
                prev.append(sb);
                sb = prev;

            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}