class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int n = piles.length;
        int rounds = n / 3;
        int count = 0;

        for(int i = 0; i < rounds; i++) {
            count += piles[n - 2];
            n -= 2;
        }

        return count;
    }
}