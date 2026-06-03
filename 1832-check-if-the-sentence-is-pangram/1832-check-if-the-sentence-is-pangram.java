class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs = new HashSet<>();

        for(Character c : sentence.toCharArray()) {
            hs.add(c);
        }

        if(hs.size() < 26) return false;

        return true;
    }
}