class Solution {
    private boolean isValid(String word) {
        if(word.length() == 0) {
            return false;
        }

        int hyphen = 0;
        for(int i = 0; i < word.length(); i++) {
            int last = word.length() - 1;
            char ch = word.charAt(i);

            if(Character.isDigit(ch)) {
                return false;
            }

            if(ch == '-') {
                hyphen++;
                if(hyphen > 1) {
                    return false;
                }
                
                if(i == 0 || i == last) {
                    return false;
                }

                char prev = word.charAt(i - 1);
                char next = word.charAt(i + 1);

                if(!Character.isLowerCase(prev) || !Character.isLowerCase(next)) {
                    return false;
                }
            }

            if(ch == '!' || ch == '.' || ch == ',') {
                if(i != last) {
                    return false;
                }
            }
        }

        return true;
    }

    public int countValidWords(String sentence) {
        int count = 0;

        String words[] = sentence.split("\\s+");
        for(String word : words) {
            if(isValid(word)) {
                count++;
            }
        }

        return count;
    }
}