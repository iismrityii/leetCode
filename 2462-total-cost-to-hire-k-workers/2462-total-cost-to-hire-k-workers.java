class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();

        int l = 0;
        int r = costs.length - 1;
        long ans = 0;

        while(k > 0) {
            while(left.size() < candidates && l <= r) {
                left.add(costs[l]);
                l++;
            }
            while(right.size() < candidates && l <= r) {
                right.add(costs[r]);
                r--;
            }

            if(left.isEmpty()) {
                ans += right.poll();
            } else if(right.isEmpty()) {
                ans += left.poll();
            } else {
                if(left.peek() <= right.peek()) {
                    ans += left.poll();
                } else {
                    ans += right.poll();
                }
            }

            k--;
        }

        return ans;
    }
}