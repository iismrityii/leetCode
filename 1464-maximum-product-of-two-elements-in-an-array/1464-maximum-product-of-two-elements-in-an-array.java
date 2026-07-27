class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n : nums) {
            pq.add(n);
        }

        int greatest = pq.peek();
        pq.poll();
        int secGreatest = pq.peek();

        return (greatest-1) * (secGreatest-1);
    }
}