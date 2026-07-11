class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        if(sum % 2 != 0) {
            return false;
        }

        int tar = sum / 2;
        int n = nums.length;

        boolean dp[][] = new boolean[n + 1][tar + 1];
        dp[n][tar] = true;

        for(int i = n - 1; i >= 0; i--) {
            for(int currSum = tar; currSum >= 0; currSum--) {
                boolean pick = false;
                if(currSum + nums[i] <= tar) {
                    pick = dp[i + 1][currSum + nums[i]];
                }

                boolean notPick = dp[i + 1][currSum];
                dp[i][currSum] = pick || notPick;
            }
        }

        return dp[0][0];
    }
}