class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int len = n / 2;
        int freq[] = new int[26];

        for(int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            freq[curr - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < freq.length; i++) {
            while(freq[i] > 0) {
                sb.append((char)(i + 'a'));
                freq[i]--;
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(sb);

        if(n % 2 == 1) {
            ans.append(s.charAt(len));
        }

        ans.append(new StringBuilder(sb).reverse());
        return ans.toString();
    }
}