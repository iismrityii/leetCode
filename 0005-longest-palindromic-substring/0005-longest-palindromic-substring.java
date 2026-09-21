class Solution {
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

    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        int maxLen = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if(isPalindrome(sub, 0, sub.length() - 1) && sub.length() > maxLen) {
                    maxLen = sub.length();
                    res = sub;
                }
            }
        }

        return res;
    }
}