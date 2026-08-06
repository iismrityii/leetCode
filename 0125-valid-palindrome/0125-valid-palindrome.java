class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
                sb.append(ch);
            } else if(Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        s = sb.toString();

        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}