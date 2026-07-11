class Solution {
    Boolean dp[][];
    private boolean solve(int i, int currSum, int tar, int nums[]) {
        if(currSum == tar) {
            return true;
        }

        if(i == nums.length) {
            return false;
        }

        if(dp[i][currSum] != null) {
            return dp[i][currSum];
        }

        boolean pick = false;

        if(currSum + nums[i] <= tar) {
            pick = solve(i + 1, currSum + nums[i], tar, nums);
        }

        boolean notPick = solve(i + 1, currSum, tar, nums);
        
        dp[i][currSum] = pick || notPick;
        return dp[i][currSum];
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if(sum % 2 != 0) {
            return false;
        }

        int tar = sum / 2;
        dp = new Boolean[nums.length][tar + 1];
        return solve(0, 0, tar, nums);
    }
}