class Solution {
    private String reverse(String s) {
        return "" + s.charAt(1) + s.charAt(0);
    }

    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();

        for(String word : words) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        int len = 0;
        boolean center = false;
        for(String word : hm.keySet()) {
            String rev = reverse(word);
            if(word.equals(rev)) {
                int freq = hm.get(word);
                len += (freq / 2) * 4;

                if(freq % 2 == 1) {
                    center = true;
                }
            }       
            else if(word.compareTo(rev) < 0 && hm.containsKey(rev)) {
                int pairs = Math.min(hm.get(word), hm.get(rev));
                len += pairs * 4;
            }
        }
        if(center) {
            len += 2;
        }
        
        return len;
    }
}