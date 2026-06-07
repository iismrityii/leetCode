class Solution {
    public boolean isValid(String word) {
        int n = word.length();

        if(n < 3) return false;

        boolean vowel = false;
        boolean consonant = false;

        for(char ch : word.toCharArray()) {
            if(Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);

                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel = true;
                } else {
                    consonant = true;
                }
            } else if(Character.isDigit(ch)) {
                continue;
            } else {
                return false;
            }
        }

        return vowel && consonant;
    }
}