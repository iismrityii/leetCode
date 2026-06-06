class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int n = part.length();

        for(char c : s.toCharArray()) {
            sb.append(c);
            if(sb.length() >= n) {
                String last = sb.substring(sb.length() - n);

                if(last.equals(part)) {
                    sb.delete(sb.length() - n, sb.length());
                }
            }
        }

        return sb.toString();
    }
}