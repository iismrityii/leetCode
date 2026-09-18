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

    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++) {
            String s = words[i];
            if(isPalindrome(s, 0, s.length() - 1)) {
                return s;
            }
        }
        return "";
    }
}