class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int counta = 0; 
        int countb = 0;

        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i))) counta++;
        }

        for (int i = n/2; i < n; i++) {
            if (isVowel(s.charAt(i))) countb++;
        }

        return counta == countb;
    }

    public boolean isVowel(Character c) {
        char i = Character.toLowerCase(c);

        if (i == 'a' || i == 'e' || i == 'o' || i == 'u' || i == 'i') {
            return true;
        }

        return false;
    }
}