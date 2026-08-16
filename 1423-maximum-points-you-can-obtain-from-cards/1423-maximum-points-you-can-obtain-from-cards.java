class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for(int point : cardPoints) {
            total += point;
        }

        int winSize = n - k;

        int l = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;

        for(int r = 0; r < n; r++) {
            sum += cardPoints[r];

            if(r - l + 1 > winSize) {
                sum -= cardPoints[l];
                l++;
            }

            if(r - l + 1 == winSize) {
                minSum = Math.min(minSum, sum);
            }
        }

        return total - minSum;
    }
}