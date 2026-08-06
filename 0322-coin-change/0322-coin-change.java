class Solution {
    int n;
    int dp[][];
    private int solve(int coins[], int i, int remAmt) {
        if(remAmt == 0) {
            return 0;
        }

        if(i == n) {
            return Integer.MAX_VALUE / 2;
        }

        if(dp[i][remAmt] != -1) {
            return dp[i][remAmt];
        }

        int pick = Integer.MAX_VALUE;
        if(remAmt >= coins[i]) {
            pick = 1 + solve(coins, i, remAmt - coins[i]);
        }
        
        int notPick = solve(coins, i + 1, remAmt);
        return dp[i][remAmt] = Math.min(pick, notPick);
    }

    public int coinChange(int[] coins, int amount) {
        this.n = coins.length;
        dp = new int[n][amount + 1];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(coins, 0, amount);
        return ans >= Integer.MAX_VALUE / 2 ? -1 : ans;
    }
}