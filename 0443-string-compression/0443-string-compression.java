class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i < n) {
            char curr = chars[i];
            int count = 0;

            while(i < n && chars[i] == curr) {
                count++;
                i++;
            }

            sb.append(curr);
            if(count > 1) {
                sb.append(count);
            }
        }

        for(int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
    }
}