class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        int l = 0;
        int r = 0;
        int maxVal = 0;
        int ans = 0;

        while (r < n) {
            char ch = s.charAt(r);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxVal = Math.max(maxVal, hm.get(ch));

            while ((r - l + 1) - maxVal > k) {
                char left = s.charAt(l);
                hm.put(left, hm.get(left) - 1);

                if (hm.get(left) == 0) {
                    hm.remove(left);
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);
            r++;
        }
        
        return ans;
    }
}