class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        for(char c : hm.keySet()) {
            if(hm.get(c) % 2 != 0) {
                count++;
            }
        }

        if(count > k) {
            return false;
        }

        return true;
    }
}