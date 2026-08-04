class Solution {
    int n;
    int dp[][];
    private int solve(int nums[], int i, int prev) {
        if(i == n) {
            return 0;
        }

        if(dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        int pick = 0;
        if(prev == -1 || nums[i] > nums[prev]) {
            pick = 1 + solve(nums, i + 1, i);
        } 
        
        int notPick = solve(nums, i + 1, prev);
        return dp[i][prev + 1] = Math.max(pick, notPick);
    }

    public int lengthOfLIS(int[] nums) {
        this.n = nums.length;
        dp = new int[n][n + 1];
        for(int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(nums, 0, -1);
    }
}