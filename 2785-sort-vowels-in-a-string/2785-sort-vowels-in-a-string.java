class Solution {
    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for(char ch : s.toCharArray()) {
            if(isVowel(ch)) {
                vowels.add(ch);
            }
        }

        Collections.sort(vowels);
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for(char ch : s.toCharArray()) {
            if(isVowel(ch)) {
                sb.append(vowels.get(j));
                j++;
            }
            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}