class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        int n = maximumHeight.length;
        long sum = 0;
        Arrays.sort(maximumHeight);

        int curr = maximumHeight[n-1];
        for(int i = n - 1; i >= 0; i--) {
            curr = Math.min(curr, maximumHeight[i]);
            if(curr <= 0) {
                return -1;
            }

            sum += curr;
            curr--;
        }

        return sum;
    }
}