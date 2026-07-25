class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }

            int val = prices[i];
            if (!st.isEmpty()) {
                prices[i] -= st.peek();
            }

            st.push(val);
        }

        return prices;
    }
}