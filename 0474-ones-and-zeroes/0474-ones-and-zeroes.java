class Solution {
    int zeros[];
    int ones[];
    int dp[][][];
    private int countZero(String s) {
        int zero = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                zero++;
            } 
        }
        return zero;
    }

    private int countOne(String s) {
        int one = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                one++;
            } 
        }
        return one;
    }

    private int solve(int i, String strs[], int m, int n) {
        if(i == strs.length) {
            return 0;
        }

        if(dp[i][m][n] != -1) {
            return dp[i][m][n];
        }

        int notPick = solve(i + 1, strs, m, n);
        int pick = 0;
        int z = zeros[i];
        int o = ones[i];

        if(z <= m && o <= n) {
            pick = 1 + solve(i + 1, strs, m - z, n - o);
        }   

        dp[i][m][n] = Math.max(pick, notPick);
        return dp[i][m][n];
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        dp = new int[len][m + 1][n + 1];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        zeros = new int[len];
        ones = new int[len];

        for (int i = 0; i < strs.length; i++) {
            zeros[i] = countZero(strs[i]);
            ones[i] = countOne(strs[i]);
        }

        return solve(0, strs, m, n);
    }
}