class Solution {
    int n;
    int dp[];
    private int solve(int i, int costs[], int dp[]) {
        if(i >= n) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        int min = Integer.MAX_VALUE;
        for(int j = 1; j <= 3; j++) {
            if(i + j <= n) {
                int cost = costs[i + j - 1] + j * j;
                min = Math.min(min, cost + solve(i + j, costs, dp));
            }
        }

        return dp[i] = min;
    } 

    public int climbStairs(int n, int[] costs) {
        this.n = costs.length; 
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(0, costs, dp);
    }
}