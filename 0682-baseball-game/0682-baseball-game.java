class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String s : operations) {
            if(s.equals("C")) {
                st.pop();

            } else if(s.equals("D")) {
                st.push(2 * st.peek());

            } else if(s.equals("+")) {
                int top1 = st.pop();
                int top2 = st.peek();
                st.push(top1);
                st.push(top1 + top2);

            } else {
                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}