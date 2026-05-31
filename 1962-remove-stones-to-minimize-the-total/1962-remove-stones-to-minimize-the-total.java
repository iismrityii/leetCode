class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : piles) {
            pq.add(num);
        }

        while(k != 0) {
            int top = pq.poll();
            top = top - top / 2;
            pq.add(top);
            k--;
        }

        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }   

        return sum;
    }
}