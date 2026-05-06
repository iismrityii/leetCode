class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();

        for(char c : allowed.toCharArray()) {
            hs.add(c);
        }

        int count = 0;
        for(String word: words){
            boolean valid = true;
            for(int i = 0; i < word.length(); i++){
                if(!hs.contains(word.charAt(i))) {
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }

        return count;
    }
}