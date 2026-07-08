class Solution {
    int dp[];
    private int maxAmt(int i, int nums[]) {
        if(i > nums.length - 1) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        int rob = nums[i] + maxAmt(i + 2, nums);
        int skip = maxAmt(i + 1, nums);

        dp[i] =  Math.max(rob, skip);
        return dp[i];
    }

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return maxAmt(0, nums);
    }
}