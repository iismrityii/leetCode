class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();

        for(char c : jewels.toCharArray()) {
            hs.add(c);
        }

        for(int i = 0; i < stones.length(); i++) {
            if(hs.contains(stones.charAt(i))) {
                ans++;
            }
        }

        return ans;
    }
}