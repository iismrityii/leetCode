class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        long cuts[] = new long[n - 1];

        for(int i = 0; i < n - 1; i++) {
            cuts[i] = (long)weights[i] + weights[i + 1];
        }

        long min = 0;
        long max = 0;
        Arrays.sort(cuts);
        for(int i = 0; i < k - 1; i++) {
            min += cuts[i];
            max += cuts[cuts.length - 1 - i];
        }

        return max - min;
    }
}