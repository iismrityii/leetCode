class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while(j < n) {
            sum += nums[j];
            if(j - i + 1 == k) {
                maxSum = Math.max(sum, maxSum);
                sum -= nums[i];
                i++;
            }

            j++;
        }

        return (double) maxSum / k;
    }
}