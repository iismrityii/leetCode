class Solution {
    int dp[][];
    private int solve(int i, int currAmt, int amount, int coins[]) {
        if(currAmt == amount) {
            return 1;
        }

        if(i == coins.length) {
            return 0;
        }

        if(dp[i][currAmt] != -1) {
            return dp[i][currAmt];
        }

        int pick = 0;
        if(currAmt + coins[i] <= amount) {
            pick = solve(i, currAmt + coins[i], amount, coins);
        } 
       
        int notPick = solve(i + 1, currAmt, amount, coins);
        dp[i][currAmt] = pick + notPick;
        return dp[i][currAmt];
    }

    public int change(int amount, int[] coins) {
        dp = new int[coins.length][amount + 1];
        for(int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, 0, amount, coins);
    }
}