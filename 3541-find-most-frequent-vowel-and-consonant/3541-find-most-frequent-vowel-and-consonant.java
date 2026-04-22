class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int maxVowel = 0;
        int maxConsonant = 0;

        for(char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for(char c : hm.keySet()) {
            int freq = hm.get(c);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                maxVowel = Math.max(freq, maxVowel);
            } else {
                maxConsonant = Math.max(freq, maxConsonant);
            }
        }
        
        return maxVowel + maxConsonant;
    }
}