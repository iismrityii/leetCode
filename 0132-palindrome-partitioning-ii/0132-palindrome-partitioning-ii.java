class Solution {
    int n;
    int dp[];
    private boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private int solve(int i, String s) {
        if(i == n) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        int ans = Integer.MAX_VALUE;
        for(int j = i; j < n; j++) {
            if(isPalindrome(s, i, j)) {
                ans = Math.min(ans, 1 + solve(j + 1, s));
            }
        }

        return dp[i] = ans;
    }

    public int minCut(String s) {
        this.n = s.length();
        dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(0, s) - 1;
    }
}