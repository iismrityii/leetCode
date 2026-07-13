class Solution {
    int dp[][];
    private int solve(int i, int remAmt, int coins[]) {
        if (remAmt == 0) {
            return 0;
        }

        if (i == coins.length) {
            return Integer.MAX_VALUE / 2;
        }

        if(dp[i][remAmt] != -1) {
            return dp[i][remAmt];
        }

        int pick = Integer.MAX_VALUE;
        if(remAmt >= coins[i]) {
            pick = 1 + solve(i, remAmt - coins[i], coins);
        }

        int notPick = solve(i + 1, remAmt, coins);
        dp[i][remAmt] = Math.min(pick, notPick);
        return dp[i][remAmt];
    }

    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length][amount + 1];
        for(int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        int coin = solve(0, amount, coins);
        return coin == Integer.MAX_VALUE / 2 ? -1 : coin;

    }
}