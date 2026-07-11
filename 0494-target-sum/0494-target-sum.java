class Solution {
    int dp[][];
    int total;
    private int solve(int i, int nums[], int target, int sum) {
        if(i == nums.length) {
            if(sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        if(dp[i][sum + total] != -1) {
            return dp[i][sum + total];
        }

        int plus = solve(i + 1, nums, target, sum + nums[i]);
        int minus = solve(i + 1, nums, target, sum - nums[i]);

        dp[i][sum + total] = plus + minus;
        return dp[i][sum + total];
    }

    public int findTargetSumWays(int[] nums, int target) {
        total = 0;
        for(int n : nums) {
            total += n;
        }

        dp = new int[nums.length + 1][2 * total + 1];
        for(int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, nums, target, 0);
    }
}