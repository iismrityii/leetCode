class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String words[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            if(i != 0) {
                sb.append(words[i] + " ");
            } else {
                sb.append(words[i]);
            }
        }

        return sb.toString();
    }
}