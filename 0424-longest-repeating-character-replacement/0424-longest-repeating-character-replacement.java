class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int maxFreq = 0;

        while(r < s.length()) {
            char c = s.charAt(r);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, hm.get(c));

            while((r - l + 1) - maxFreq > k) {
                char left = s.charAt(l);
                hm.put(left, hm.get(left) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}