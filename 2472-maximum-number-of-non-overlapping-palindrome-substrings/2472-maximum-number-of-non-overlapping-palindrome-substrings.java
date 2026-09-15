class Solution {
    int dp[];
    boolean palindrome[][];

    private int solve(String s, int k, int i, int dp[]) {
        if(i >= s.length()) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        int notPick = solve(s, k, i + 1, dp);
        int pick = 0;

        for(int j = i; j < s.length(); j++) {
            if(j - i + 1 >= k && palindrome[i][j]) {
                pick = Math.max(
                    pick,
                    1 + solve(s, k, j + 1, dp)
                );
            }
        }

        return dp[i] = Math.max(pick, notPick);
    }

    public int maxPalindromes(String s, int k) {
        int n = s.length();
        dp = new int[n];
        Arrays.fill(dp, -1);

        palindrome = new boolean[n][n];

        for(int i = n - 1; i >= 0; i--) {
            for(int j = i; j < n; j++) {

                if(s.charAt(i) == s.charAt(j) &&
                   (j - i <= 1 || palindrome[i + 1][j - 1])) {

                    palindrome[i][j] = true;
                }
            }
        }

        return solve(s, k, 0, dp);
    }
}