class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        double maxSum = Integer.MIN_VALUE;
        int count = 1;

        while(r < nums.length) {
            sum += nums[r];
            if(r - l + 1 < k) {
                count++;
            }

            if(r - l + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[l];
                l++;
            }

            r++;
        }

        return (maxSum / count);
    }
}