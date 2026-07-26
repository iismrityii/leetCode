class Solution {
    int n;
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
        if(i == s.length()) {
            return 0;
        }

        int ans = 0;
        for(int j = i; j < n; j++) {
            if(isPalindrome(s, i, j)) {
                ans++;
            }
        }

        return ans + solve(i + 1, s);
    }

    public int countSubstrings(String s) {
        this.n = s.length();
        return solve(0, s);
    }
}