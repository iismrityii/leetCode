class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] ans = new int[temps.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < temps.length; i++) {
            while (!st.isEmpty() && temps[st.peek()] < temps[i]) {
                ans[st.peek()] = i - st.pop();
            }
            st.push(i);
        }

        return ans;
    }
}