class Solution {
    int dp[][];
    private int solve(int i, int prev, int nums[]) {
        if(i == nums.length) {
            return 0;
        }

        if(dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        int pick = 0;
        if(prev == -1 || nums[i] > nums[prev]) {
            pick = 1 + solve(i + 1, i, nums);
        }

        int notPick = solve(i + 1, prev, nums);
        dp[i][prev + 1] = Math.max(pick, notPick);
        return dp[i][prev + 1];
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n][n + 1];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, -1, nums);
    }
}