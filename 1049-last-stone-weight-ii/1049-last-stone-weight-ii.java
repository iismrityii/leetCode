class Solution {
    int dp[][];
    private int solve(int i, int currSum, int stones[], int totalSum) {
        if(i == stones.length) {
            int otherSum = totalSum - currSum;
            return Math.abs(currSum - otherSum);
        }

        if(dp[i][currSum] != -1) {
            return dp[i][currSum];
        }

        int pick = solve(i + 1, currSum + stones[i], stones, totalSum);
        int notPick = solve(i + 1, currSum, stones, totalSum);

        dp[i][currSum] = Math.min(pick, notPick);
        return dp[i][currSum];
    }

    public int lastStoneWeightII(int[] stones) {
        int totalSum = 0;
        for(int s : stones) {
            totalSum += s;
        }

        dp = new int[stones.length][totalSum + 1];
        for(int i = 0; i < stones.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, 0, stones, totalSum);
    }
}