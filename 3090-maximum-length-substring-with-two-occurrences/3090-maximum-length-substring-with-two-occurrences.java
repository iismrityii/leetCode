class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;

        while(r < s.length()) {
            char curr = s.charAt(r);
            hm.put(curr, hm.getOrDefault(curr, 0) + 1);

            while(hm.get(curr) > 2) {
                hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
                l++;
            }

            maxLen = Math.max(r - l + 1, maxLen);
            r++;
        }

        return maxLen;
    }
}