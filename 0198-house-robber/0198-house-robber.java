class Solution {
    int n;
    int dp[];
    private int solve(int nums[], int i) {
        if(i >= n) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        int rob = nums[i] + solve(nums, i + 2);
        int skip = solve(nums, i + 1);

        return dp[i] = Math.max(rob, skip);
    }

    public int rob(int[] nums) {
        n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(nums, 0);
    }
}